package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Wechatmpmsg {
    private Long id;

    private String toWechatAppId;

    private String fromWechatOpenId;

    private Byte msgType;

    private Long dataId;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToWechatAppId() {
        return toWechatAppId;
    }

    public void setToWechatAppId(String toWechatAppId) {
        this.toWechatAppId = toWechatAppId == null ? null : toWechatAppId.trim();
    }

    public String getFromWechatOpenId() {
        return fromWechatOpenId;
    }

    public void setFromWechatOpenId(String fromWechatOpenId) {
        this.fromWechatOpenId = fromWechatOpenId == null ? null : fromWechatOpenId.trim();
    }

    public Byte getMsgType() {
        return msgType;
    }

    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", toWechatAppId=").append(toWechatAppId);
        sb.append(", fromWechatOpenId=").append(fromWechatOpenId);
        sb.append(", msgType=").append(msgType);
        sb.append(", dataId=").append(dataId);
        sb.append(", createTime=").append(createTime);
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
        Wechatmpmsg other = (Wechatmpmsg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getToWechatAppId() == null ? other.getToWechatAppId() == null : this.getToWechatAppId().equals(other.getToWechatAppId()))
            && (this.getFromWechatOpenId() == null ? other.getFromWechatOpenId() == null : this.getFromWechatOpenId().equals(other.getFromWechatOpenId()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getToWechatAppId() == null) ? 0 : getToWechatAppId().hashCode());
        result = prime * result + ((getFromWechatOpenId() == null) ? 0 : getFromWechatOpenId().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}