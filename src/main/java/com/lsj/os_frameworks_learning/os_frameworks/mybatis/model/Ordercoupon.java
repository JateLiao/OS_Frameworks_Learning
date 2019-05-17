package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Ordercoupon {
    private Long seqId;

    private String orderNo;

    private Byte couponProvider;

    private String couponMchId;

    private String couponId;

    private Byte couponSettlementType;

    private Integer couponFee;

    private Date createTime;

    private Date updateTime;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Byte getCouponSettlementType() {
        return couponSettlementType;
    }

    public void setCouponSettlementType(Byte couponSettlementType) {
        this.couponSettlementType = couponSettlementType;
    }

    public Integer getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(Integer couponFee) {
        this.couponFee = couponFee;
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
        sb.append(", orderNo=").append(orderNo);
        sb.append(", couponProvider=").append(couponProvider);
        sb.append(", couponMchId=").append(couponMchId);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponSettlementType=").append(couponSettlementType);
        sb.append(", couponFee=").append(couponFee);
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
        Ordercoupon other = (Ordercoupon) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getCouponProvider() == null ? other.getCouponProvider() == null : this.getCouponProvider().equals(other.getCouponProvider()))
            && (this.getCouponMchId() == null ? other.getCouponMchId() == null : this.getCouponMchId().equals(other.getCouponMchId()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponSettlementType() == null ? other.getCouponSettlementType() == null : this.getCouponSettlementType().equals(other.getCouponSettlementType()))
            && (this.getCouponFee() == null ? other.getCouponFee() == null : this.getCouponFee().equals(other.getCouponFee()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getCouponProvider() == null) ? 0 : getCouponProvider().hashCode());
        result = prime * result + ((getCouponMchId() == null) ? 0 : getCouponMchId().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponSettlementType() == null) ? 0 : getCouponSettlementType().hashCode());
        result = prime * result + ((getCouponFee() == null) ? 0 : getCouponFee().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}