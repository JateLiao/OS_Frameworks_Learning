package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Orderusercourseaffiliate {
    private Integer id;

    private Integer affId;

    private Integer inviteeUserId;

    private Integer applyClassId;

    private String orderNo;

    private Integer inviteCouponAmount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAffId() {
        return affId;
    }

    public void setAffId(Integer affId) {
        this.affId = affId;
    }

    public Integer getInviteeUserId() {
        return inviteeUserId;
    }

    public void setInviteeUserId(Integer inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
    }

    public Integer getApplyClassId() {
        return applyClassId;
    }

    public void setApplyClassId(Integer applyClassId) {
        this.applyClassId = applyClassId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getInviteCouponAmount() {
        return inviteCouponAmount;
    }

    public void setInviteCouponAmount(Integer inviteCouponAmount) {
        this.inviteCouponAmount = inviteCouponAmount;
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
        sb.append(", affId=").append(affId);
        sb.append(", inviteeUserId=").append(inviteeUserId);
        sb.append(", applyClassId=").append(applyClassId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", inviteCouponAmount=").append(inviteCouponAmount);
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
        Orderusercourseaffiliate other = (Orderusercourseaffiliate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAffId() == null ? other.getAffId() == null : this.getAffId().equals(other.getAffId()))
            && (this.getInviteeUserId() == null ? other.getInviteeUserId() == null : this.getInviteeUserId().equals(other.getInviteeUserId()))
            && (this.getApplyClassId() == null ? other.getApplyClassId() == null : this.getApplyClassId().equals(other.getApplyClassId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getInviteCouponAmount() == null ? other.getInviteCouponAmount() == null : this.getInviteCouponAmount().equals(other.getInviteCouponAmount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAffId() == null) ? 0 : getAffId().hashCode());
        result = prime * result + ((getInviteeUserId() == null) ? 0 : getInviteeUserId().hashCode());
        result = prime * result + ((getApplyClassId() == null) ? 0 : getApplyClassId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getInviteCouponAmount() == null) ? 0 : getInviteCouponAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}