package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wehubtaskprogress {
    private String taskId;

    private Integer taskType;

    private Long wxuid;

    private Integer progress;

    private String message;

    private String batchId;

    private Date createTime;

    private Date updateTime;

    private Byte taskLevel;

    private String taskDetail;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Long getWxuid() {
        return wxuid;
    }

    public void setWxuid(Long wxuid) {
        this.wxuid = wxuid;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
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

    public Byte getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(Byte taskLevel) {
        this.taskLevel = taskLevel;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", taskType=").append(taskType);
        sb.append(", wxuid=").append(wxuid);
        sb.append(", progress=").append(progress);
        sb.append(", message=").append(message);
        sb.append(", batchId=").append(batchId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", taskLevel=").append(taskLevel);
        sb.append(", taskDetail=").append(taskDetail);
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
        Wehubtaskprogress other = (Wehubtaskprogress) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getWxuid() == null ? other.getWxuid() == null : this.getWxuid().equals(other.getWxuid()))
            && (this.getProgress() == null ? other.getProgress() == null : this.getProgress().equals(other.getProgress()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getBatchId() == null ? other.getBatchId() == null : this.getBatchId().equals(other.getBatchId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getTaskLevel() == null ? other.getTaskLevel() == null : this.getTaskLevel().equals(other.getTaskLevel()))
            && (this.getTaskDetail() == null ? other.getTaskDetail() == null : this.getTaskDetail().equals(other.getTaskDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getWxuid() == null) ? 0 : getWxuid().hashCode());
        result = prime * result + ((getProgress() == null) ? 0 : getProgress().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getBatchId() == null) ? 0 : getBatchId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getTaskLevel() == null) ? 0 : getTaskLevel().hashCode());
        result = prime * result + ((getTaskDetail() == null) ? 0 : getTaskDetail().hashCode());
        return result;
    }
}