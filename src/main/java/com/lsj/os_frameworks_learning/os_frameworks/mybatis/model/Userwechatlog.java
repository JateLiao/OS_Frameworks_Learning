package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userwechatlog {
    private Integer seqId;

    private Integer userId;

    private Integer wechatUserId;

    private Byte actionFlag;

    private Date createTime;

    private Date upateTime;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(Integer wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    public Byte getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(Byte actionFlag) {
        this.actionFlag = actionFlag;
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
        sb.append(", seqId=").append(seqId);
        sb.append(", userId=").append(userId);
        sb.append(", wechatUserId=").append(wechatUserId);
        sb.append(", actionFlag=").append(actionFlag);
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
        Userwechatlog other = (Userwechatlog) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWechatUserId() == null ? other.getWechatUserId() == null : this.getWechatUserId().equals(other.getWechatUserId()))
            && (this.getActionFlag() == null ? other.getActionFlag() == null : this.getActionFlag().equals(other.getActionFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpateTime() == null ? other.getUpateTime() == null : this.getUpateTime().equals(other.getUpateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWechatUserId() == null) ? 0 : getWechatUserId().hashCode());
        result = prime * result + ((getActionFlag() == null) ? 0 : getActionFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpateTime() == null) ? 0 : getUpateTime().hashCode());
        return result;
    }
}