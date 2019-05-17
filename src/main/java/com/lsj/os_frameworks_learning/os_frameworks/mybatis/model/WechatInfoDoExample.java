package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class WechatInfoDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatInfoDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("seq_id is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(Integer value) {
            addCriterion("seq_id =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Integer value) {
            addCriterion("seq_id <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Integer value) {
            addCriterion("seq_id >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq_id >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Integer value) {
            addCriterion("seq_id <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("seq_id <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Integer> values) {
            addCriterion("seq_id in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Integer> values) {
            addCriterion("seq_id not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("seq_id between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seq_id not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameIsNull() {
            addCriterion("wechat_app_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameIsNotNull() {
            addCriterion("wechat_app_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameEqualTo(String value) {
            addCriterion("wechat_app_name =", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameNotEqualTo(String value) {
            addCriterion("wechat_app_name <>", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameGreaterThan(String value) {
            addCriterion("wechat_app_name >", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_app_name >=", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameLessThan(String value) {
            addCriterion("wechat_app_name <", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_app_name <=", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameLike(String value) {
            addCriterion("wechat_app_name like", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameNotLike(String value) {
            addCriterion("wechat_app_name not like", value, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameIn(List<String> values) {
            addCriterion("wechat_app_name in", values, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameNotIn(List<String> values) {
            addCriterion("wechat_app_name not in", values, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameBetween(String value1, String value2) {
            addCriterion("wechat_app_name between", value1, value2, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppNameNotBetween(String value1, String value2) {
            addCriterion("wechat_app_name not between", value1, value2, "wechatAppName");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdIsNull() {
            addCriterion("wechat_app_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdIsNotNull() {
            addCriterion("wechat_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdEqualTo(String value) {
            addCriterion("wechat_app_id =", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdNotEqualTo(String value) {
            addCriterion("wechat_app_id <>", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdGreaterThan(String value) {
            addCriterion("wechat_app_id >", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_app_id >=", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdLessThan(String value) {
            addCriterion("wechat_app_id <", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_app_id <=", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdLike(String value) {
            addCriterion("wechat_app_id like", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdNotLike(String value) {
            addCriterion("wechat_app_id not like", value, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdIn(List<String> values) {
            addCriterion("wechat_app_id in", values, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdNotIn(List<String> values) {
            addCriterion("wechat_app_id not in", values, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdBetween(String value1, String value2) {
            addCriterion("wechat_app_id between", value1, value2, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatAppIdNotBetween(String value1, String value2) {
            addCriterion("wechat_app_id not between", value1, value2, "wechatAppId");
            return (Criteria) this;
        }

        public Criteria andWechatSecretIsNull() {
            addCriterion("wechat_secret is null");
            return (Criteria) this;
        }

        public Criteria andWechatSecretIsNotNull() {
            addCriterion("wechat_secret is not null");
            return (Criteria) this;
        }

        public Criteria andWechatSecretEqualTo(String value) {
            addCriterion("wechat_secret =", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretNotEqualTo(String value) {
            addCriterion("wechat_secret <>", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretGreaterThan(String value) {
            addCriterion("wechat_secret >", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_secret >=", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretLessThan(String value) {
            addCriterion("wechat_secret <", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretLessThanOrEqualTo(String value) {
            addCriterion("wechat_secret <=", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretLike(String value) {
            addCriterion("wechat_secret like", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretNotLike(String value) {
            addCriterion("wechat_secret not like", value, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretIn(List<String> values) {
            addCriterion("wechat_secret in", values, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretNotIn(List<String> values) {
            addCriterion("wechat_secret not in", values, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretBetween(String value1, String value2) {
            addCriterion("wechat_secret between", value1, value2, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatSecretNotBetween(String value1, String value2) {
            addCriterion("wechat_secret not between", value1, value2, "wechatSecret");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeIsNull() {
            addCriterion("wechat_app_type is null");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeIsNotNull() {
            addCriterion("wechat_app_type is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeEqualTo(Byte value) {
            addCriterion("wechat_app_type =", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeNotEqualTo(Byte value) {
            addCriterion("wechat_app_type <>", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeGreaterThan(Byte value) {
            addCriterion("wechat_app_type >", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("wechat_app_type >=", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeLessThan(Byte value) {
            addCriterion("wechat_app_type <", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeLessThanOrEqualTo(Byte value) {
            addCriterion("wechat_app_type <=", value, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeIn(List<Byte> values) {
            addCriterion("wechat_app_type in", values, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeNotIn(List<Byte> values) {
            addCriterion("wechat_app_type not in", values, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeBetween(Byte value1, Byte value2) {
            addCriterion("wechat_app_type between", value1, value2, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatAppTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("wechat_app_type not between", value1, value2, "wechatAppType");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagIsNull() {
            addCriterion("wechat_default_mp_flag is null");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagIsNotNull() {
            addCriterion("wechat_default_mp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagEqualTo(Byte value) {
            addCriterion("wechat_default_mp_flag =", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagNotEqualTo(Byte value) {
            addCriterion("wechat_default_mp_flag <>", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagGreaterThan(Byte value) {
            addCriterion("wechat_default_mp_flag >", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("wechat_default_mp_flag >=", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagLessThan(Byte value) {
            addCriterion("wechat_default_mp_flag <", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagLessThanOrEqualTo(Byte value) {
            addCriterion("wechat_default_mp_flag <=", value, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagIn(List<Byte> values) {
            addCriterion("wechat_default_mp_flag in", values, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagNotIn(List<Byte> values) {
            addCriterion("wechat_default_mp_flag not in", values, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagBetween(Byte value1, Byte value2) {
            addCriterion("wechat_default_mp_flag between", value1, value2, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatDefaultMpFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("wechat_default_mp_flag not between", value1, value2, "wechatDefaultMpFlag");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdIsNull() {
            addCriterion("wechat_raw_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdIsNotNull() {
            addCriterion("wechat_raw_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdEqualTo(String value) {
            addCriterion("wechat_raw_id =", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdNotEqualTo(String value) {
            addCriterion("wechat_raw_id <>", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdGreaterThan(String value) {
            addCriterion("wechat_raw_id >", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_raw_id >=", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdLessThan(String value) {
            addCriterion("wechat_raw_id <", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_raw_id <=", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdLike(String value) {
            addCriterion("wechat_raw_id like", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdNotLike(String value) {
            addCriterion("wechat_raw_id not like", value, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdIn(List<String> values) {
            addCriterion("wechat_raw_id in", values, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdNotIn(List<String> values) {
            addCriterion("wechat_raw_id not in", values, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdBetween(String value1, String value2) {
            addCriterion("wechat_raw_id between", value1, value2, "wechatRawId");
            return (Criteria) this;
        }

        public Criteria andWechatRawIdNotBetween(String value1, String value2) {
            addCriterion("wechat_raw_id not between", value1, value2, "wechatRawId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}