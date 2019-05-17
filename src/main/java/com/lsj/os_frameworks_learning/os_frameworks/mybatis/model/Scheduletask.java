package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Scheduletask {
    private Integer id;

    private Date scheduleTime;

    private String messageTopic;

    private String messageTag;

    private Byte sendFlag;

    private Date createTime;

    private Date updateTime;

    private String messageBody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getMessageTopic() {
        return messageTopic;
    }

    public void setMessageTopic(String messageTopic) {
        this.messageTopic = messageTopic == null ? null : messageTopic.trim();
    }

    public String getMessageTag() {
        return messageTag;
    }

    public void setMessageTag(String messageTag) {
        this.messageTag = messageTag == null ? null : messageTag.trim();
    }

    public Byte getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(Byte sendFlag) {
        this.sendFlag = sendFlag;
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

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scheduleTime=").append(scheduleTime);
        sb.append(", messageTopic=").append(messageTopic);
        sb.append(", messageTag=").append(messageTag);
        sb.append(", sendFlag=").append(sendFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", messageBody=").append(messageBody);
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
        Scheduletask other = (Scheduletask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScheduleTime() == null ? other.getScheduleTime() == null : this.getScheduleTime().equals(other.getScheduleTime()))
            && (this.getMessageTopic() == null ? other.getMessageTopic() == null : this.getMessageTopic().equals(other.getMessageTopic()))
            && (this.getMessageTag() == null ? other.getMessageTag() == null : this.getMessageTag().equals(other.getMessageTag()))
            && (this.getSendFlag() == null ? other.getSendFlag() == null : this.getSendFlag().equals(other.getSendFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getMessageBody() == null ? other.getMessageBody() == null : this.getMessageBody().equals(other.getMessageBody()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScheduleTime() == null) ? 0 : getScheduleTime().hashCode());
        result = prime * result + ((getMessageTopic() == null) ? 0 : getMessageTopic().hashCode());
        result = prime * result + ((getMessageTag() == null) ? 0 : getMessageTag().hashCode());
        result = prime * result + ((getSendFlag() == null) ? 0 : getSendFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        return result;
    }
}