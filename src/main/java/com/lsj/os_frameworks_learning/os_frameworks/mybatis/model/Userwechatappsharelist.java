package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userwechatappsharelist {
    private Long id;

    private Long userWechatAppShareId;

    private Byte shareWay;

    private String wechatOpenGid;

    private String wechatAppShareKeySuffix;

    private String sourcePagePath;

    private String additionalData;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserWechatAppShareId() {
        return userWechatAppShareId;
    }

    public void setUserWechatAppShareId(Long userWechatAppShareId) {
        this.userWechatAppShareId = userWechatAppShareId;
    }

    public Byte getShareWay() {
        return shareWay;
    }

    public void setShareWay(Byte shareWay) {
        this.shareWay = shareWay;
    }

    public String getWechatOpenGid() {
        return wechatOpenGid;
    }

    public void setWechatOpenGid(String wechatOpenGid) {
        this.wechatOpenGid = wechatOpenGid == null ? null : wechatOpenGid.trim();
    }

    public String getWechatAppShareKeySuffix() {
        return wechatAppShareKeySuffix;
    }

    public void setWechatAppShareKeySuffix(String wechatAppShareKeySuffix) {
        this.wechatAppShareKeySuffix = wechatAppShareKeySuffix == null ? null : wechatAppShareKeySuffix.trim();
    }

    public String getSourcePagePath() {
        return sourcePagePath;
    }

    public void setSourcePagePath(String sourcePagePath) {
        this.sourcePagePath = sourcePagePath == null ? null : sourcePagePath.trim();
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData == null ? null : additionalData.trim();
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
        sb.append(", userWechatAppShareId=").append(userWechatAppShareId);
        sb.append(", shareWay=").append(shareWay);
        sb.append(", wechatOpenGid=").append(wechatOpenGid);
        sb.append(", wechatAppShareKeySuffix=").append(wechatAppShareKeySuffix);
        sb.append(", sourcePagePath=").append(sourcePagePath);
        sb.append(", additionalData=").append(additionalData);
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
        Userwechatappsharelist other = (Userwechatappsharelist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserWechatAppShareId() == null ? other.getUserWechatAppShareId() == null : this.getUserWechatAppShareId().equals(other.getUserWechatAppShareId()))
            && (this.getShareWay() == null ? other.getShareWay() == null : this.getShareWay().equals(other.getShareWay()))
            && (this.getWechatOpenGid() == null ? other.getWechatOpenGid() == null : this.getWechatOpenGid().equals(other.getWechatOpenGid()))
            && (this.getWechatAppShareKeySuffix() == null ? other.getWechatAppShareKeySuffix() == null : this.getWechatAppShareKeySuffix().equals(other.getWechatAppShareKeySuffix()))
            && (this.getSourcePagePath() == null ? other.getSourcePagePath() == null : this.getSourcePagePath().equals(other.getSourcePagePath()))
            && (this.getAdditionalData() == null ? other.getAdditionalData() == null : this.getAdditionalData().equals(other.getAdditionalData()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserWechatAppShareId() == null) ? 0 : getUserWechatAppShareId().hashCode());
        result = prime * result + ((getShareWay() == null) ? 0 : getShareWay().hashCode());
        result = prime * result + ((getWechatOpenGid() == null) ? 0 : getWechatOpenGid().hashCode());
        result = prime * result + ((getWechatAppShareKeySuffix() == null) ? 0 : getWechatAppShareKeySuffix().hashCode());
        result = prime * result + ((getSourcePagePath() == null) ? 0 : getSourcePagePath().hashCode());
        result = prime * result + ((getAdditionalData() == null) ? 0 : getAdditionalData().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}