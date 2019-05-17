package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Wechatvisitorreceivecourse {
    private Integer id;

    private Long localWechatVisitorId;

    private String receiveCourseKey;

    private Integer receiveClassId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getLocalWechatVisitorId() {
        return localWechatVisitorId;
    }

    public void setLocalWechatVisitorId(Long localWechatVisitorId) {
        this.localWechatVisitorId = localWechatVisitorId;
    }

    public String getReceiveCourseKey() {
        return receiveCourseKey;
    }

    public void setReceiveCourseKey(String receiveCourseKey) {
        this.receiveCourseKey = receiveCourseKey == null ? null : receiveCourseKey.trim();
    }

    public Integer getReceiveClassId() {
        return receiveClassId;
    }

    public void setReceiveClassId(Integer receiveClassId) {
        this.receiveClassId = receiveClassId;
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
        sb.append(", localWechatVisitorId=").append(localWechatVisitorId);
        sb.append(", receiveCourseKey=").append(receiveCourseKey);
        sb.append(", receiveClassId=").append(receiveClassId);
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
        Wechatvisitorreceivecourse other = (Wechatvisitorreceivecourse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLocalWechatVisitorId() == null ? other.getLocalWechatVisitorId() == null : this.getLocalWechatVisitorId().equals(other.getLocalWechatVisitorId()))
            && (this.getReceiveCourseKey() == null ? other.getReceiveCourseKey() == null : this.getReceiveCourseKey().equals(other.getReceiveCourseKey()))
            && (this.getReceiveClassId() == null ? other.getReceiveClassId() == null : this.getReceiveClassId().equals(other.getReceiveClassId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLocalWechatVisitorId() == null) ? 0 : getLocalWechatVisitorId().hashCode());
        result = prime * result + ((getReceiveCourseKey() == null) ? 0 : getReceiveCourseKey().hashCode());
        result = prime * result + ((getReceiveClassId() == null) ? 0 : getReceiveClassId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}