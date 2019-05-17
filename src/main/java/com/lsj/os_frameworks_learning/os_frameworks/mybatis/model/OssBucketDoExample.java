package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OssBucketDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OssBucketDoExample() {
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

        public Criteria andPurposeKeyIsNull() {
            addCriterion("purpose_key is null");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyIsNotNull() {
            addCriterion("purpose_key is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyEqualTo(String value) {
            addCriterion("purpose_key =", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyNotEqualTo(String value) {
            addCriterion("purpose_key <>", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyGreaterThan(String value) {
            addCriterion("purpose_key >", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_key >=", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyLessThan(String value) {
            addCriterion("purpose_key <", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyLessThanOrEqualTo(String value) {
            addCriterion("purpose_key <=", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyLike(String value) {
            addCriterion("purpose_key like", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyNotLike(String value) {
            addCriterion("purpose_key not like", value, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyIn(List<String> values) {
            addCriterion("purpose_key in", values, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyNotIn(List<String> values) {
            addCriterion("purpose_key not in", values, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyBetween(String value1, String value2) {
            addCriterion("purpose_key between", value1, value2, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andPurposeKeyNotBetween(String value1, String value2) {
            addCriterion("purpose_key not between", value1, value2, "purposeKey");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("provider_id is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(Byte value) {
            addCriterion("provider_id =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(Byte value) {
            addCriterion("provider_id <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(Byte value) {
            addCriterion("provider_id >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("provider_id >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(Byte value) {
            addCriterion("provider_id <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(Byte value) {
            addCriterion("provider_id <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<Byte> values) {
            addCriterion("provider_id in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<Byte> values) {
            addCriterion("provider_id not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(Byte value1, Byte value2) {
            addCriterion("provider_id between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(Byte value1, Byte value2) {
            addCriterion("provider_id not between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andBucketNameIsNull() {
            addCriterion("bucket_name is null");
            return (Criteria) this;
        }

        public Criteria andBucketNameIsNotNull() {
            addCriterion("bucket_name is not null");
            return (Criteria) this;
        }

        public Criteria andBucketNameEqualTo(String value) {
            addCriterion("bucket_name =", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameNotEqualTo(String value) {
            addCriterion("bucket_name <>", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameGreaterThan(String value) {
            addCriterion("bucket_name >", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_name >=", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameLessThan(String value) {
            addCriterion("bucket_name <", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameLessThanOrEqualTo(String value) {
            addCriterion("bucket_name <=", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameLike(String value) {
            addCriterion("bucket_name like", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameNotLike(String value) {
            addCriterion("bucket_name not like", value, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameIn(List<String> values) {
            addCriterion("bucket_name in", values, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameNotIn(List<String> values) {
            addCriterion("bucket_name not in", values, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameBetween(String value1, String value2) {
            addCriterion("bucket_name between", value1, value2, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketNameNotBetween(String value1, String value2) {
            addCriterion("bucket_name not between", value1, value2, "bucketName");
            return (Criteria) this;
        }

        public Criteria andBucketDomainIsNull() {
            addCriterion("bucket_domain is null");
            return (Criteria) this;
        }

        public Criteria andBucketDomainIsNotNull() {
            addCriterion("bucket_domain is not null");
            return (Criteria) this;
        }

        public Criteria andBucketDomainEqualTo(String value) {
            addCriterion("bucket_domain =", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainNotEqualTo(String value) {
            addCriterion("bucket_domain <>", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainGreaterThan(String value) {
            addCriterion("bucket_domain >", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_domain >=", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainLessThan(String value) {
            addCriterion("bucket_domain <", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainLessThanOrEqualTo(String value) {
            addCriterion("bucket_domain <=", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainLike(String value) {
            addCriterion("bucket_domain like", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainNotLike(String value) {
            addCriterion("bucket_domain not like", value, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainIn(List<String> values) {
            addCriterion("bucket_domain in", values, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainNotIn(List<String> values) {
            addCriterion("bucket_domain not in", values, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainBetween(String value1, String value2) {
            addCriterion("bucket_domain between", value1, value2, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainNotBetween(String value1, String value2) {
            addCriterion("bucket_domain not between", value1, value2, "bucketDomain");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolIsNull() {
            addCriterion("bucket_domain_protocol is null");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolIsNotNull() {
            addCriterion("bucket_domain_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolEqualTo(String value) {
            addCriterion("bucket_domain_protocol =", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolNotEqualTo(String value) {
            addCriterion("bucket_domain_protocol <>", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolGreaterThan(String value) {
            addCriterion("bucket_domain_protocol >", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_domain_protocol >=", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolLessThan(String value) {
            addCriterion("bucket_domain_protocol <", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolLessThanOrEqualTo(String value) {
            addCriterion("bucket_domain_protocol <=", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolLike(String value) {
            addCriterion("bucket_domain_protocol like", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolNotLike(String value) {
            addCriterion("bucket_domain_protocol not like", value, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolIn(List<String> values) {
            addCriterion("bucket_domain_protocol in", values, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolNotIn(List<String> values) {
            addCriterion("bucket_domain_protocol not in", values, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolBetween(String value1, String value2) {
            addCriterion("bucket_domain_protocol between", value1, value2, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketDomainProtocolNotBetween(String value1, String value2) {
            addCriterion("bucket_domain_protocol not between", value1, value2, "bucketDomainProtocol");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathIsNull() {
            addCriterion("bucket_prefix_path is null");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathIsNotNull() {
            addCriterion("bucket_prefix_path is not null");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathEqualTo(String value) {
            addCriterion("bucket_prefix_path =", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathNotEqualTo(String value) {
            addCriterion("bucket_prefix_path <>", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathGreaterThan(String value) {
            addCriterion("bucket_prefix_path >", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathGreaterThanOrEqualTo(String value) {
            addCriterion("bucket_prefix_path >=", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathLessThan(String value) {
            addCriterion("bucket_prefix_path <", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathLessThanOrEqualTo(String value) {
            addCriterion("bucket_prefix_path <=", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathLike(String value) {
            addCriterion("bucket_prefix_path like", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathNotLike(String value) {
            addCriterion("bucket_prefix_path not like", value, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathIn(List<String> values) {
            addCriterion("bucket_prefix_path in", values, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathNotIn(List<String> values) {
            addCriterion("bucket_prefix_path not in", values, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathBetween(String value1, String value2) {
            addCriterion("bucket_prefix_path between", value1, value2, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andBucketPrefixPathNotBetween(String value1, String value2) {
            addCriterion("bucket_prefix_path not between", value1, value2, "bucketPrefixPath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIsNull() {
            addCriterion("private_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIsNotNull() {
            addCriterion("private_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagEqualTo(Byte value) {
            addCriterion("private_flag =", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotEqualTo(Byte value) {
            addCriterion("private_flag <>", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagGreaterThan(Byte value) {
            addCriterion("private_flag >", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("private_flag >=", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagLessThan(Byte value) {
            addCriterion("private_flag <", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagLessThanOrEqualTo(Byte value) {
            addCriterion("private_flag <=", value, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagIn(List<Byte> values) {
            addCriterion("private_flag in", values, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotIn(List<Byte> values) {
            addCriterion("private_flag not in", values, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagBetween(Byte value1, Byte value2) {
            addCriterion("private_flag between", value1, value2, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andPrivateFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("private_flag not between", value1, value2, "privateFlag");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Integer value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Integer value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Integer value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Integer value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Integer> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Integer> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Integer value1, Integer value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
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