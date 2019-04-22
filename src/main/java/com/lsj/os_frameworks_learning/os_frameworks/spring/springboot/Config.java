package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/4/230:32
 */
@Configuration
@PropertySource(value = {"classpath:/com/lsj/os_frameworks_learning/os_frameworks/springboot/jdbc.properties"},
        encoding = "UTF-8")
public class Config {
}
