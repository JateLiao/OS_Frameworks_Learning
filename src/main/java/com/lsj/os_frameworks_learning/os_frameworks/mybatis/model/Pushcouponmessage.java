package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Pushcouponmessage {
    private Integer id;

    private Byte pushType;

    private Byte pushSubType;

    private String pushTargetId;

    private String pushBatchId;

    private Byte mqProviderId;

    private String mqMessageId;

    private Integer userId;

    private Byte couponProvider;

    private String couponMchId;

    private String couponStockId;

    private Byte couponCount;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getPushType() {
        return pushType;
    }

    public void setPushType(Byte pushType) {
        this.pushType = pushType;
    }

    public Byte getPushSubType() {
        return pushSubType;
    }

    public void setPushSubType(Byte pushSubType) {
        this.pushSubType = pushSubType;
    }

    public String getPushTargetId() {
        return pushTargetId;
    }

    public void setPushTargetId(String pushTargetId) {
        this.pushTargetId = pushTargetId == null ? null : pushTargetId.trim();
    }

    public String getPushBatchId() {
        return pushBatchId;
    }

    public void setPushBatchId(String pushBatchId) {
        this.pushBatchId = pushBatchId == null ? null : pushBatchId.trim();
    }

    public Byte getMqProviderId() {
        return mqProviderId;
    }

    public void setMqProviderId(Byte mqProviderId) {
        this.mqProviderId = mqProviderId;
    }

    public String getMqMessageId() {
        return mqMessageId;
    }

    public void setMqMessageId(String mqMessageId) {
        this.mqMessageId = mqMessageId == null ? null : mqMessageId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getCouponProvider() {
        return couponProvider;
    }

    public void setCouponProvider(Byte couponProvider) {
        this.couponProvider = couponProvider;
    }

    public String getCouponMchId() {
        return couponMchId;
    }

    public void setCouponMchId(String couponMchId) {
        this.couponMchId = couponMchId == null ? null : couponMchId.trim();
    }

    public String getCouponStockId() {
        return couponStockId;
    }

    public void setCouponStockId(String couponStockId) {
        this.couponStockId = couponStockId == null ? null : couponStockId.trim();
    }

    public Byte getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Byte couponCount) {
        this.couponCount = couponCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", id=").append(id);
        sb.append(", pushType=").append(pushType);
        sb.append(", pushSubType=").append(pushSubType);
        sb.append(", pushTargetId=").append(pushTargetId);
        sb.append(", pushBatchId=").append(pushBatchId);
        sb.append(", mqProviderId=").append(mqProviderId);
        sb.append(", mqMessageId=").append(mqMessageId);
        sb.append(", userId=").append(userId);
        sb.append(", couponProvider=").append(couponProvider);
        sb.append(", couponMchId=").append(couponMchId);
        sb.append(", couponStockId=").append(couponStockId);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", remark=").append(remark);
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
        Pushcouponmessage other = (Pushcouponmessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPushType() == null ? other.getPushType() == null : this.getPushType().equals(other.getPushType()))
            && (this.getPushSubType() == null ? other.getPushSubType() == null : this.getPushSubType().equals(other.getPushSubType()))
            && (this.getPushTargetId() == null ? other.getPushTargetId() == null : this.getPushTargetId().equals(other.getPushTargetId()))
            && (this.getPushBatchId() == null ? other.getPushBatchId() == null : this.getPushBatchId().equals(other.getPushBatchId()))
            && (this.getMqProviderId() == null ? other.getMqProviderId() == null : this.getMqProviderId().equals(other.getMqProviderId()))
            && (this.getMqMessageId() == null ? other.getMqMessageId() == null : this.getMqMessageId().equals(other.getMqMessageId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCouponProvider() == null ? other.getCouponProvider() == null : this.getCouponProvider().equals(other.getCouponProvider()))
            && (this.getCouponMchId() == null ? other.getCouponMchId() == null : this.getCouponMchId().equals(other.getCouponMchId()))
            && (this.getCouponStockId() == null ? other.getCouponStockId() == null : this.getCouponStockId().equals(other.getCouponStockId()))
            && (this.getCouponCount() == null ? other.getCouponCount() == null : this.getCouponCount().equals(other.getCouponCount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPushType() == null) ? 0 : getPushType().hashCode());
        result = prime * result + ((getPushSubType() == null) ? 0 : getPushSubType().hashCode());
        result = prime * result + ((getPushTargetId() == null) ? 0 : getPushTargetId().hashCode());
        result = prime * result + ((getPushBatchId() == null) ? 0 : getPushBatchId().hashCode());
        result = prime * result + ((getMqProviderId() == null) ? 0 : getMqProviderId().hashCode());
        result = prime * result + ((getMqMessageId() == null) ? 0 : getMqMessageId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCouponProvider() == null) ? 0 : getCouponProvider().hashCode());
        result = prime * result + ((getCouponMchId() == null) ? 0 : getCouponMchId().hashCode());
        result = prime * result + ((getCouponStockId() == null) ? 0 : getCouponStockId().hashCode());
        result = prime * result + ((getCouponCount() == null) ? 0 : getCouponCount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}