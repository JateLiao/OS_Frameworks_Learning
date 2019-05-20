package utils;

import com.google.gson.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * 一个通用的 Gson 处理工具
 */
public class CommonGsonUtil {

    private static final GsonBuilder INSTANCE = new GsonBuilder();

    static {
        INSTANCE.disableHtmlEscaping();
        INSTANCE.registerTypeAdapter(Date.class, new CommonDateDeserializer());
    }

    public static GsonBuilder getInstance() {
        return INSTANCE;
    }

    public static Gson create() {
        return INSTANCE.create();
    }

    public static String toJson(Object obj) {
        return create().toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> type) {
        return create().fromJson(json, type);
    }

    public static <T> List<T> listFromJson(String json, Class<T> type) {
        ParameterizedType parameterizedType = new ListParameterizedType(type);
        return create().fromJson(json, parameterizedType);
    }

    /**
     * 自定义一个时间转换的参数
     */
    private static class CommonDateDeserializer implements JsonDeserializer<Date> {
        private static final String[] dateFormatPatterns = {
                "yyyyMMdd",
                "yyyyMMddHH",
                "yyyyMMddHHmm",
                "yyyyMMddHHmmss",
                "yyyy-MM-dd",
                "yyyy-MM-dd HH",
                "yyyy-MM-dd HH:mm",
                "yyyy-MM-dd HH:mm:ss"
        };

        @Override
        public Date deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if (!(element instanceof JsonPrimitive)) {
                throw new JsonParseException("Date must be a primitive type");
            }
            JsonPrimitive json = (JsonPrimitive) element;
            // 先看看是不是可以个格式化的时间字符串
            if (json.isString()) {
                String time = json.getAsString();
                if (StringUtils.isBlank(time)) {
                    return null;
                }
                try {
                    return DateUtils.parseDate(time, dateFormatPatterns);
                } catch (ParseException e) {
                    throw new JsonParseException("Date format pattern can not be recognized");
                }
            }
            // 如果是时间戳的话，直接转时间戳
            if (json.isNumber()) {
                return new Date(json.getAsLong());
            }
            return null;
        }
    }

    /**
     * 支持直接转成数组
     */
    private static class ListParameterizedType implements ParameterizedType {
        private Class type;

        public ListParameterizedType(Class type) {
            this.type = type;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{type};
        }

        @Override
        public Type getRawType() {
            return List.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}
