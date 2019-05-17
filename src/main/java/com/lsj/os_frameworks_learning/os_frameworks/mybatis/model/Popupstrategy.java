package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Popupstrategy {
    private Long seqId;

    private Integer popupId;

    private Byte strategyType;

    private String strategyValue;

    private Date createTime;

    private Date updateTime;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public Integer getPopupId() {
        return popupId;
    }

    public void setPopupId(Integer popupId) {
        this.popupId = popupId;
    }

    public Byte getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Byte strategyType) {
        this.strategyType = strategyType;
    }

    public String getStrategyValue() {
        return strategyValue;
    }

    public void setStrategyValue(String strategyValue) {
        this.strategyValue = strategyValue == null ? null : strategyValue.trim();
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
        sb.append(", popupId=").append(popupId);
        sb.append(", strategyType=").append(strategyType);
        sb.append(", strategyValue=").append(strategyValue);
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
        Popupstrategy other = (Popupstrategy) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getPopupId() == null ? other.getPopupId() == null : this.getPopupId().equals(other.getPopupId()))
            && (this.getStrategyType() == null ? other.getStrategyType() == null : this.getStrategyType().equals(other.getStrategyType()))
            && (this.getStrategyValue() == null ? other.getStrategyValue() == null : this.getStrategyValue().equals(other.getStrategyValue()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getPopupId() == null) ? 0 : getPopupId().hashCode());
        result = prime * result + ((getStrategyType() == null) ? 0 : getStrategyType().hashCode());
        result = prime * result + ((getStrategyValue() == null) ? 0 : getStrategyValue().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}