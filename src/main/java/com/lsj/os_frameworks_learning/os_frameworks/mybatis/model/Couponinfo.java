package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Couponinfo {
    private Integer seqId;

    private String key;

    private Byte provider;

    private String mchId;

    private String stockId;

    private String name;

    private Integer value;

    private Integer useThreshold;

    private Byte stockStatus;

    private Integer totalCount;

    private Integer hasSendCount;

    private Integer maxQuota;

    private Date effectiveBeginTime;

    private Date effectiveEndTime;

    private Date createTime;

    private Date updateTime;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Byte getProvider() {
        return provider;
    }

    public void setProvider(Byte provider) {
        this.provider = provider;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getUseThreshold() {
        return useThreshold;
    }

    public void setUseThreshold(Integer useThreshold) {
        this.useThreshold = useThreshold;
    }

    public Byte getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Byte stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getHasSendCount() {
        return hasSendCount;
    }

    public void setHasSendCount(Integer hasSendCount) {
        this.hasSendCount = hasSendCount;
    }

    public Integer getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
    }

    public Date getEffectiveBeginTime() {
        return effectiveBeginTime;
    }

    public void setEffectiveBeginTime(Date effectiveBeginTime) {
        this.effectiveBeginTime = effectiveBeginTime;
    }

    public Date getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(Date effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqId=").append(seqId);
        sb.append(", key=").append(key);
        sb.append(", provider=").append(provider);
        sb.append(", mchId=").append(mchId);
        sb.append(", stockId=").append(stockId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", useThreshold=").append(useThreshold);
        sb.append(", stockStatus=").append(stockStatus);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", hasSendCount=").append(hasSendCount);
        sb.append(", maxQuota=").append(maxQuota);
        sb.append(", effectiveBeginTime=").append(effectiveBeginTime);
        sb.append(", effectiveEndTime=").append(effectiveEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Couponinfo other = (Couponinfo) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getProvider() == null ? other.getProvider() == null : this.getProvider().equals(other.getProvider()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getUseThreshold() == null ? other.getUseThreshold() == null : this.getUseThreshold().equals(other.getUseThreshold()))
            && (this.getStockStatus() == null ? other.getStockStatus() == null : this.getStockStatus().equals(other.getStockStatus()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getHasSendCount() == null ? other.getHasSendCount() == null : this.getHasSendCount().equals(other.getHasSendCount()))
            && (this.getMaxQuota() == null ? other.getMaxQuota() == null : this.getMaxQuota().equals(other.getMaxQuota()))
            && (this.getEffectiveBeginTime() == null ? other.getEffectiveBeginTime() == null : this.getEffectiveBeginTime().equals(other.getEffectiveBeginTime()))
            && (this.getEffectiveEndTime() == null ? other.getEffectiveEndTime() == null : this.getEffectiveEndTime().equals(other.getEffectiveEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getProvider() == null) ? 0 : getProvider().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getUseThreshold() == null) ? 0 : getUseThreshold().hashCode());
        result = prime * result + ((getStockStatus() == null) ? 0 : getStockStatus().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getHasSendCount() == null) ? 0 : getHasSendCount().hashCode());
        result = prime * result + ((getMaxQuota() == null) ? 0 : getMaxQuota().hashCode());
        result = prime * result + ((getEffectiveBeginTime() == null) ? 0 : getEffectiveBeginTime().hashCode());
        result = prime * result + ((getEffectiveEndTime() == null) ? 0 : getEffectiveEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}