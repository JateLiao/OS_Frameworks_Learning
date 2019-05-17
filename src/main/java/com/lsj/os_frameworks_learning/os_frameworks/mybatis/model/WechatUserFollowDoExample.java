package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class WechatUserFollowDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatUserFollowDoExample() {
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

        public Criteria andWechatOpenidIsNull() {
            addCriterion("wechat_openid is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNotNull() {
            addCriterion("wechat_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidEqualTo(String value) {
            addCriterion("wechat_openid =", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotEqualTo(String value) {
            addCriterion("wechat_openid <>", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThan(String value) {
            addCriterion("wechat_openid >", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_openid >=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThan(String value) {
            addCriterion("wechat_openid <", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThanOrEqualTo(String value) {
            addCriterion("wechat_openid <=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLike(String value) {
            addCriterion("wechat_openid like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotLike(String value) {
            addCriterion("wechat_openid not like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIn(List<String> values) {
            addCriterion("wechat_openid in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotIn(List<String> values) {
            addCriterion("wechat_openid not in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidBetween(String value1, String value2) {
            addCriterion("wechat_openid between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotBetween(String value1, String value2) {
            addCriterion("wechat_openid not between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIsNull() {
            addCriterion("follow_status is null");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIsNotNull() {
            addCriterion("follow_status is not null");
            return (Criteria) this;
        }

        public Criteria andFollowStatusEqualTo(Byte value) {
            addCriterion("follow_status =", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotEqualTo(Byte value) {
            addCriterion("follow_status <>", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusGreaterThan(Byte value) {
            addCriterion("follow_status >", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("follow_status >=", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusLessThan(Byte value) {
            addCriterion("follow_status <", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusLessThanOrEqualTo(Byte value) {
            addCriterion("follow_status <=", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIn(List<Byte> values) {
            addCriterion("follow_status in", values, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotIn(List<Byte> values) {
            addCriterion("follow_status not in", values, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusBetween(Byte value1, Byte value2) {
            addCriterion("follow_status between", value1, value2, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("follow_status not between", value1, value2, "followStatus");
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