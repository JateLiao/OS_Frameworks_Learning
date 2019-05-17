package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userclasslog {
    private Integer seqId;

    private Integer userClassId;

    private Byte unlockType;

    private Byte unlockStatus;

    private Byte actionType;

    private String actionTargetId;

    private String actionRemark;

    private Date createTime;

    private Date updateTime;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Integer getUserClassId() {
        return userClassId;
    }

    public void setUserClassId(Integer userClassId) {
        this.userClassId = userClassId;
    }

    public Byte getUnlockType() {
        return unlockType;
    }

    public void setUnlockType(Byte unlockType) {
        this.unlockType = unlockType;
    }

    public Byte getUnlockStatus() {
        return unlockStatus;
    }

    public void setUnlockStatus(Byte unlockStatus) {
        this.unlockStatus = unlockStatus;
    }

    public Byte getActionType() {
        return actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public String getActionTargetId() {
        return actionTargetId;
    }

    public void setActionTargetId(String actionTargetId) {
        this.actionTargetId = actionTargetId == null ? null : actionTargetId.trim();
    }

    public String getActionRemark() {
        return actionRemark;
    }

    public void setActionRemark(String actionRemark) {
        this.actionRemark = actionRemark == null ? null : actionRemark.trim();
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
        sb.append(", userClassId=").append(userClassId);
        sb.append(", unlockType=").append(unlockType);
        sb.append(", unlockStatus=").append(unlockStatus);
        sb.append(", actionType=").append(actionType);
        sb.append(", actionTargetId=").append(actionTargetId);
        sb.append(", actionRemark=").append(actionRemark);
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
        Userclasslog other = (Userclasslog) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getUserClassId() == null ? other.getUserClassId() == null : this.getUserClassId().equals(other.getUserClassId()))
            && (this.getUnlockType() == null ? other.getUnlockType() == null : this.getUnlockType().equals(other.getUnlockType()))
            && (this.getUnlockStatus() == null ? other.getUnlockStatus() == null : this.getUnlockStatus().equals(other.getUnlockStatus()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()))
            && (this.getActionTargetId() == null ? other.getActionTargetId() == null : this.getActionTargetId().equals(other.getActionTargetId()))
            && (this.getActionRemark() == null ? other.getActionRemark() == null : this.getActionRemark().equals(other.getActionRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getUserClassId() == null) ? 0 : getUserClassId().hashCode());
        result = prime * result + ((getUnlockType() == null) ? 0 : getUnlockType().hashCode());
        result = prime * result + ((getUnlockStatus() == null) ? 0 : getUnlockStatus().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        result = prime * result + ((getActionTargetId() == null) ? 0 : getActionTargetId().hashCode());
        result = prime * result + ((getActionRemark() == null) ? 0 : getActionRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}