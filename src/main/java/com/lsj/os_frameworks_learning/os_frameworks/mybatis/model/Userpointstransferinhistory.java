package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userpointstransferinhistory {
    private Integer id;

    private Integer userId;

    private Integer points;

    private Integer transferStatus;

    private Byte isSchedule;

    private Date scheduleTime;

    private Byte hasCancel;

    private Byte cancelFlag;

    private Byte actionType;

    private String actionTargetId;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Byte getIsSchedule() {
        return isSchedule;
    }

    public void setIsSchedule(Byte isSchedule) {
        this.isSchedule = isSchedule;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Byte getHasCancel() {
        return hasCancel;
    }

    public void setHasCancel(Byte hasCancel) {
        this.hasCancel = hasCancel;
    }

    public Byte getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(Byte cancelFlag) {
        this.cancelFlag = cancelFlag;
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
        sb.append(", userId=").append(userId);
        sb.append(", points=").append(points);
        sb.append(", transferStatus=").append(transferStatus);
        sb.append(", isSchedule=").append(isSchedule);
        sb.append(", scheduleTime=").append(scheduleTime);
        sb.append(", hasCancel=").append(hasCancel);
        sb.append(", cancelFlag=").append(cancelFlag);
        sb.append(", actionType=").append(actionType);
        sb.append(", actionTargetId=").append(actionTargetId);
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
        Userpointstransferinhistory other = (Userpointstransferinhistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPoints() == null ? other.getPoints() == null : this.getPoints().equals(other.getPoints()))
            && (this.getTransferStatus() == null ? other.getTransferStatus() == null : this.getTransferStatus().equals(other.getTransferStatus()))
            && (this.getIsSchedule() == null ? other.getIsSchedule() == null : this.getIsSchedule().equals(other.getIsSchedule()))
            && (this.getScheduleTime() == null ? other.getScheduleTime() == null : this.getScheduleTime().equals(other.getScheduleTime()))
            && (this.getHasCancel() == null ? other.getHasCancel() == null : this.getHasCancel().equals(other.getHasCancel()))
            && (this.getCancelFlag() == null ? other.getCancelFlag() == null : this.getCancelFlag().equals(other.getCancelFlag()))
            && (this.getActionType() == null ? other.getActionType() == null : this.getActionType().equals(other.getActionType()))
            && (this.getActionTargetId() == null ? other.getActionTargetId() == null : this.getActionTargetId().equals(other.getActionTargetId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPoints() == null) ? 0 : getPoints().hashCode());
        result = prime * result + ((getTransferStatus() == null) ? 0 : getTransferStatus().hashCode());
        result = prime * result + ((getIsSchedule() == null) ? 0 : getIsSchedule().hashCode());
        result = prime * result + ((getScheduleTime() == null) ? 0 : getScheduleTime().hashCode());
        result = prime * result + ((getHasCancel() == null) ? 0 : getHasCancel().hashCode());
        result = prime * result + ((getCancelFlag() == null) ? 0 : getCancelFlag().hashCode());
        result = prime * result + ((getActionType() == null) ? 0 : getActionType().hashCode());
        result = prime * result + ((getActionTargetId() == null) ? 0 : getActionTargetId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}