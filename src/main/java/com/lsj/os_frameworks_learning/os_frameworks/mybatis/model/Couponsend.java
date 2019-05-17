package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Couponsend {
    private Long id;

    private Byte sendType;

    private Byte sendSubType;

    private String sendTargetId;

    private Integer userId;

    private Byte couponProvider;

    private String couponMchId;

    private String couponStockId;

    private Date createTime;

    private Date upateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getSendType() {
        return sendType;
    }

    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    public Byte getSendSubType() {
        return sendSubType;
    }

    public void setSendSubType(Byte sendSubType) {
        this.sendSubType = sendSubType;
    }

    public String getSendTargetId() {
        return sendTargetId;
    }

    public void setSendTargetId(String sendTargetId) {
        this.sendTargetId = sendTargetId == null ? null : sendTargetId.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendType=").append(sendType);
        sb.append(", sendSubType=").append(sendSubType);
        sb.append(", sendTargetId=").append(sendTargetId);
        sb.append(", userId=").append(userId);
        sb.append(", couponProvider=").append(couponProvider);
        sb.append(", couponMchId=").append(couponMchId);
        sb.append(", couponStockId=").append(couponStockId);
        sb.append(", createTime=").append(createTime);
        sb.append(", upateTime=").append(upateTime);
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
        Couponsend other = (Couponsend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSendType() == null ? other.getSendType() == null : this.getSendType().equals(other.getSendType()))
            && (this.getSendSubType() == null ? other.getSendSubType() == null : this.getSendSubType().equals(other.getSendSubType()))
            && (this.getSendTargetId() == null ? other.getSendTargetId() == null : this.getSendTargetId().equals(other.getSendTargetId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCouponProvider() == null ? other.getCouponProvider() == null : this.getCouponProvider().equals(other.getCouponProvider()))
            && (this.getCouponMchId() == null ? other.getCouponMchId() == null : this.getCouponMchId().equals(other.getCouponMchId()))
            && (this.getCouponStockId() == null ? other.getCouponStockId() == null : this.getCouponStockId().equals(other.getCouponStockId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpateTime() == null ? other.getUpateTime() == null : this.getUpateTime().equals(other.getUpateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSendType() == null) ? 0 : getSendType().hashCode());
        result = prime * result + ((getSendSubType() == null) ? 0 : getSendSubType().hashCode());
        result = prime * result + ((getSendTargetId() == null) ? 0 : getSendTargetId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCouponProvider() == null) ? 0 : getCouponProvider().hashCode());
        result = prime * result + ((getCouponMchId() == null) ? 0 : getCouponMchId().hashCode());
        result = prime * result + ((getCouponStockId() == null) ? 0 : getCouponStockId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpateTime() == null) ? 0 : getUpateTime().hashCode());
        return result;
    }
}