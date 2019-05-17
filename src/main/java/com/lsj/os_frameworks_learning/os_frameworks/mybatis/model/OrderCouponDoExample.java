package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCouponDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCouponDoExample() {
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

        public Criteria andSeqIdEqualTo(Long value) {
            addCriterion("seq_id =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Long value) {
            addCriterion("seq_id <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Long value) {
            addCriterion("seq_id >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_id >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Long value) {
            addCriterion("seq_id <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Long value) {
            addCriterion("seq_id <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Long> values) {
            addCriterion("seq_id in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Long> values) {
            addCriterion("seq_id not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Long value1, Long value2) {
            addCriterion("seq_id between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Long value1, Long value2) {
            addCriterion("seq_id not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCouponProviderIsNull() {
            addCriterion("coupon_provider is null");
            return (Criteria) this;
        }

        public Criteria andCouponProviderIsNotNull() {
            addCriterion("coupon_provider is not null");
            return (Criteria) this;
        }

        public Criteria andCouponProviderEqualTo(Byte value) {
            addCriterion("coupon_provider =", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderNotEqualTo(Byte value) {
            addCriterion("coupon_provider <>", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderGreaterThan(Byte value) {
            addCriterion("coupon_provider >", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_provider >=", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderLessThan(Byte value) {
            addCriterion("coupon_provider <", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_provider <=", value, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderIn(List<Byte> values) {
            addCriterion("coupon_provider in", values, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderNotIn(List<Byte> values) {
            addCriterion("coupon_provider not in", values, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderBetween(Byte value1, Byte value2) {
            addCriterion("coupon_provider between", value1, value2, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponProviderNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_provider not between", value1, value2, "couponProvider");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdIsNull() {
            addCriterion("coupon_mch_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdIsNotNull() {
            addCriterion("coupon_mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdEqualTo(String value) {
            addCriterion("coupon_mch_id =", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdNotEqualTo(String value) {
            addCriterion("coupon_mch_id <>", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdGreaterThan(String value) {
            addCriterion("coupon_mch_id >", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_mch_id >=", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdLessThan(String value) {
            addCriterion("coupon_mch_id <", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_mch_id <=", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdLike(String value) {
            addCriterion("coupon_mch_id like", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdNotLike(String value) {
            addCriterion("coupon_mch_id not like", value, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdIn(List<String> values) {
            addCriterion("coupon_mch_id in", values, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdNotIn(List<String> values) {
            addCriterion("coupon_mch_id not in", values, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdBetween(String value1, String value2) {
            addCriterion("coupon_mch_id between", value1, value2, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponMchIdNotBetween(String value1, String value2) {
            addCriterion("coupon_mch_id not between", value1, value2, "couponMchId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeIsNull() {
            addCriterion("coupon_settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeIsNotNull() {
            addCriterion("coupon_settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeEqualTo(Byte value) {
            addCriterion("coupon_settlement_type =", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeNotEqualTo(Byte value) {
            addCriterion("coupon_settlement_type <>", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeGreaterThan(Byte value) {
            addCriterion("coupon_settlement_type >", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_settlement_type >=", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeLessThan(Byte value) {
            addCriterion("coupon_settlement_type <", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_settlement_type <=", value, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeIn(List<Byte> values) {
            addCriterion("coupon_settlement_type in", values, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeNotIn(List<Byte> values) {
            addCriterion("coupon_settlement_type not in", values, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_settlement_type between", value1, value2, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponSettlementTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_settlement_type not between", value1, value2, "couponSettlementType");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNull() {
            addCriterion("coupon_fee is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNotNull() {
            addCriterion("coupon_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeEqualTo(Integer value) {
            addCriterion("coupon_fee =", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotEqualTo(Integer value) {
            addCriterion("coupon_fee <>", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThan(Integer value) {
            addCriterion("coupon_fee >", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_fee >=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThan(Integer value) {
            addCriterion("coupon_fee <", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_fee <=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIn(List<Integer> values) {
            addCriterion("coupon_fee in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotIn(List<Integer> values) {
            addCriterion("coupon_fee not in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_fee between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_fee not between", value1, value2, "couponFee");
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