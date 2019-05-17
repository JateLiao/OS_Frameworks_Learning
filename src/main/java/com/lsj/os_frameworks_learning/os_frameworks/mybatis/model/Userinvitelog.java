package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userinvitelog {
    private Long seqId;

    private Integer inviterUserId;

    private Integer inviteeUserId;

    private Byte inviteWay;

    private Byte inviteWayType;

    private String inviteTargetId;

    private Byte inviteSuccess;

    private Date createTime;

    private Date updateTime;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public Integer getInviterUserId() {
        return inviterUserId;
    }

    public void setInviterUserId(Integer inviterUserId) {
        this.inviterUserId = inviterUserId;
    }

    public Integer getInviteeUserId() {
        return inviteeUserId;
    }

    public void setInviteeUserId(Integer inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
    }

    public Byte getInviteWay() {
        return inviteWay;
    }

    public void setInviteWay(Byte inviteWay) {
        this.inviteWay = inviteWay;
    }

    public Byte getInviteWayType() {
        return inviteWayType;
    }

    public void setInviteWayType(Byte inviteWayType) {
        this.inviteWayType = inviteWayType;
    }

    public String getInviteTargetId() {
        return inviteTargetId;
    }

    public void setInviteTargetId(String inviteTargetId) {
        this.inviteTargetId = inviteTargetId == null ? null : inviteTargetId.trim();
    }

    public Byte getInviteSuccess() {
        return inviteSuccess;
    }

    public void setInviteSuccess(Byte inviteSuccess) {
        this.inviteSuccess = inviteSuccess;
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
        sb.append(", inviterUserId=").append(inviterUserId);
        sb.append(", inviteeUserId=").append(inviteeUserId);
        sb.append(", inviteWay=").append(inviteWay);
        sb.append(", inviteWayType=").append(inviteWayType);
        sb.append(", inviteTargetId=").append(inviteTargetId);
        sb.append(", inviteSuccess=").append(inviteSuccess);
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
        Userinvitelog other = (Userinvitelog) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getInviterUserId() == null ? other.getInviterUserId() == null : this.getInviterUserId().equals(other.getInviterUserId()))
            && (this.getInviteeUserId() == null ? other.getInviteeUserId() == null : this.getInviteeUserId().equals(other.getInviteeUserId()))
            && (this.getInviteWay() == null ? other.getInviteWay() == null : this.getInviteWay().equals(other.getInviteWay()))
            && (this.getInviteWayType() == null ? other.getInviteWayType() == null : this.getInviteWayType().equals(other.getInviteWayType()))
            && (this.getInviteTargetId() == null ? other.getInviteTargetId() == null : this.getInviteTargetId().equals(other.getInviteTargetId()))
            && (this.getInviteSuccess() == null ? other.getInviteSuccess() == null : this.getInviteSuccess().equals(other.getInviteSuccess()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getInviterUserId() == null) ? 0 : getInviterUserId().hashCode());
        result = prime * result + ((getInviteeUserId() == null) ? 0 : getInviteeUserId().hashCode());
        result = prime * result + ((getInviteWay() == null) ? 0 : getInviteWay().hashCode());
        result = prime * result + ((getInviteWayType() == null) ? 0 : getInviteWayType().hashCode());
        result = prime * result + ((getInviteTargetId() == null) ? 0 : getInviteTargetId().hashCode());
        result = prime * result + ((getInviteSuccess() == null) ? 0 : getInviteSuccess().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}