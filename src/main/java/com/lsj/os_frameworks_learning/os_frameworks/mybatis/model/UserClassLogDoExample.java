package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserClassLogDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserClassLogDoExample() {
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

        public Criteria andUserClassIdIsNull() {
            addCriterion("user_class_id is null");
            return (Criteria) this;
        }

        public Criteria andUserClassIdIsNotNull() {
            addCriterion("user_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserClassIdEqualTo(Integer value) {
            addCriterion("user_class_id =", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdNotEqualTo(Integer value) {
            addCriterion("user_class_id <>", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdGreaterThan(Integer value) {
            addCriterion("user_class_id >", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_class_id >=", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdLessThan(Integer value) {
            addCriterion("user_class_id <", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_class_id <=", value, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdIn(List<Integer> values) {
            addCriterion("user_class_id in", values, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdNotIn(List<Integer> values) {
            addCriterion("user_class_id not in", values, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdBetween(Integer value1, Integer value2) {
            addCriterion("user_class_id between", value1, value2, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUserClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_class_id not between", value1, value2, "userClassId");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIsNull() {
            addCriterion("unlock_type is null");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIsNotNull() {
            addCriterion("unlock_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeEqualTo(Byte value) {
            addCriterion("unlock_type =", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotEqualTo(Byte value) {
            addCriterion("unlock_type <>", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeGreaterThan(Byte value) {
            addCriterion("unlock_type >", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("unlock_type >=", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeLessThan(Byte value) {
            addCriterion("unlock_type <", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeLessThanOrEqualTo(Byte value) {
            addCriterion("unlock_type <=", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIn(List<Byte> values) {
            addCriterion("unlock_type in", values, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotIn(List<Byte> values) {
            addCriterion("unlock_type not in", values, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeBetween(Byte value1, Byte value2) {
            addCriterion("unlock_type between", value1, value2, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("unlock_type not between", value1, value2, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusIsNull() {
            addCriterion("unlock_status is null");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusIsNotNull() {
            addCriterion("unlock_status is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusEqualTo(Byte value) {
            addCriterion("unlock_status =", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusNotEqualTo(Byte value) {
            addCriterion("unlock_status <>", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusGreaterThan(Byte value) {
            addCriterion("unlock_status >", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("unlock_status >=", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusLessThan(Byte value) {
            addCriterion("unlock_status <", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusLessThanOrEqualTo(Byte value) {
            addCriterion("unlock_status <=", value, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusIn(List<Byte> values) {
            addCriterion("unlock_status in", values, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusNotIn(List<Byte> values) {
            addCriterion("unlock_status not in", values, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusBetween(Byte value1, Byte value2) {
            addCriterion("unlock_status between", value1, value2, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andUnlockStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("unlock_status not between", value1, value2, "unlockStatus");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("action_type is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("action_type is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(Byte value) {
            addCriterion("action_type =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(Byte value) {
            addCriterion("action_type <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(Byte value) {
            addCriterion("action_type >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("action_type >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(Byte value) {
            addCriterion("action_type <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("action_type <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<Byte> values) {
            addCriterion("action_type in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<Byte> values) {
            addCriterion("action_type not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(Byte value1, Byte value2) {
            addCriterion("action_type between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("action_type not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdIsNull() {
            addCriterion("action_target_id is null");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdIsNotNull() {
            addCriterion("action_target_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdEqualTo(String value) {
            addCriterion("action_target_id =", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdNotEqualTo(String value) {
            addCriterion("action_target_id <>", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdGreaterThan(String value) {
            addCriterion("action_target_id >", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdGreaterThanOrEqualTo(String value) {
            addCriterion("action_target_id >=", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdLessThan(String value) {
            addCriterion("action_target_id <", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdLessThanOrEqualTo(String value) {
            addCriterion("action_target_id <=", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdLike(String value) {
            addCriterion("action_target_id like", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdNotLike(String value) {
            addCriterion("action_target_id not like", value, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdIn(List<String> values) {
            addCriterion("action_target_id in", values, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdNotIn(List<String> values) {
            addCriterion("action_target_id not in", values, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdBetween(String value1, String value2) {
            addCriterion("action_target_id between", value1, value2, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionTargetIdNotBetween(String value1, String value2) {
            addCriterion("action_target_id not between", value1, value2, "actionTargetId");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIsNull() {
            addCriterion("action_remark is null");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIsNotNull() {
            addCriterion("action_remark is not null");
            return (Criteria) this;
        }

        public Criteria andActionRemarkEqualTo(String value) {
            addCriterion("action_remark =", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotEqualTo(String value) {
            addCriterion("action_remark <>", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkGreaterThan(String value) {
            addCriterion("action_remark >", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("action_remark >=", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLessThan(String value) {
            addCriterion("action_remark <", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLessThanOrEqualTo(String value) {
            addCriterion("action_remark <=", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkLike(String value) {
            addCriterion("action_remark like", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotLike(String value) {
            addCriterion("action_remark not like", value, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkIn(List<String> values) {
            addCriterion("action_remark in", values, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotIn(List<String> values) {
            addCriterion("action_remark not in", values, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkBetween(String value1, String value2) {
            addCriterion("action_remark between", value1, value2, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andActionRemarkNotBetween(String value1, String value2) {
            addCriterion("action_remark not between", value1, value2, "actionRemark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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