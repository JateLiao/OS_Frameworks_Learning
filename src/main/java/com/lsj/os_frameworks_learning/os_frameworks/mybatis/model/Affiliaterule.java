package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Affiliaterule {
    private Integer id;

    private String key;

    private Byte pointType;

    private Integer inviterPointCount;

    private Integer inviteePointCount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Byte getPointType() {
        return pointType;
    }

    public void setPointType(Byte pointType) {
        this.pointType = pointType;
    }

    public Integer getInviterPointCount() {
        return inviterPointCount;
    }

    public void setInviterPointCount(Integer inviterPointCount) {
        this.inviterPointCount = inviterPointCount;
    }

    public Integer getInviteePointCount() {
        return inviteePointCount;
    }

    public void setInviteePointCount(Integer inviteePointCount) {
        this.inviteePointCount = inviteePointCount;
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
        sb.append(", key=").append(key);
        sb.append(", pointType=").append(pointType);
        sb.append(", inviterPointCount=").append(inviterPointCount);
        sb.append(", inviteePointCount=").append(inviteePointCount);
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
        Affiliaterule other = (Affiliaterule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getPointType() == null ? other.getPointType() == null : this.getPointType().equals(other.getPointType()))
            && (this.getInviterPointCount() == null ? other.getInviterPointCount() == null : this.getInviterPointCount().equals(other.getInviterPointCount()))
            && (this.getInviteePointCount() == null ? other.getInviteePointCount() == null : this.getInviteePointCount().equals(other.getInviteePointCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getPointType() == null) ? 0 : getPointType().hashCode());
        result = prime * result + ((getInviterPointCount() == null) ? 0 : getInviterPointCount().hashCode());
        result = prime * result + ((getInviteePointCount() == null) ? 0 : getInviteePointCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}