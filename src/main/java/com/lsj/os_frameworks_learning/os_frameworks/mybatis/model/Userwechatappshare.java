package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userwechatappshare {
    private Long id;

    private Integer userId;

    private String wechatAppId;

    private String wechatAppShareKeyPrefix;

    private String targetPagePath;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId == null ? null : wechatAppId.trim();
    }

    public String getWechatAppShareKeyPrefix() {
        return wechatAppShareKeyPrefix;
    }

    public void setWechatAppShareKeyPrefix(String wechatAppShareKeyPrefix) {
        this.wechatAppShareKeyPrefix = wechatAppShareKeyPrefix == null ? null : wechatAppShareKeyPrefix.trim();
    }

    public String getTargetPagePath() {
        return targetPagePath;
    }

    public void setTargetPagePath(String targetPagePath) {
        this.targetPagePath = targetPagePath == null ? null : targetPagePath.trim();
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
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", wechatAppShareKeyPrefix=").append(wechatAppShareKeyPrefix);
        sb.append(", targetPagePath=").append(targetPagePath);
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
        Userwechatappshare other = (Userwechatappshare) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getWechatAppShareKeyPrefix() == null ? other.getWechatAppShareKeyPrefix() == null : this.getWechatAppShareKeyPrefix().equals(other.getWechatAppShareKeyPrefix()))
            && (this.getTargetPagePath() == null ? other.getTargetPagePath() == null : this.getTargetPagePath().equals(other.getTargetPagePath()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWechatAppId() == null) ? 0 : getWechatAppId().hashCode());
        result = prime * result + ((getWechatAppShareKeyPrefix() == null) ? 0 : getWechatAppShareKeyPrefix().hashCode());
        result = prime * result + ((getTargetPagePath() == null) ? 0 : getTargetPagePath().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}