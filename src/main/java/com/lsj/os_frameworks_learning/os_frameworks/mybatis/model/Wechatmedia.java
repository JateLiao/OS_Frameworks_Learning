package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Wechatmedia {
    private String key;

    private String brief;

    private String wechatAppId;

    private Byte uploadApiType;

    private String mediaType;

    private String originalFile;

    private String mediaId;

    private Date expireTime;

    private Integer totalHandleTimes;

    private Date createTime;

    private Date updateTime;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId == null ? null : wechatAppId.trim();
    }

    public Byte getUploadApiType() {
        return uploadApiType;
    }

    public void setUploadApiType(Byte uploadApiType) {
        this.uploadApiType = uploadApiType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public String getOriginalFile() {
        return originalFile;
    }

    public void setOriginalFile(String originalFile) {
        this.originalFile = originalFile == null ? null : originalFile.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getTotalHandleTimes() {
        return totalHandleTimes;
    }

    public void setTotalHandleTimes(Integer totalHandleTimes) {
        this.totalHandleTimes = totalHandleTimes;
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
        sb.append(", key=").append(key);
        sb.append(", brief=").append(brief);
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", uploadApiType=").append(uploadApiType);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", originalFile=").append(originalFile);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", totalHandleTimes=").append(totalHandleTimes);
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
        Wechatmedia other = (Wechatmedia) that;
        return (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getUploadApiType() == null ? other.getUploadApiType() == null : this.getUploadApiType().equals(other.getUploadApiType()))
            && (this.getMediaType() == null ? other.getMediaType() == null : this.getMediaType().equals(other.getMediaType()))
            && (this.getOriginalFile() == null ? other.getOriginalFile() == null : this.getOriginalFile().equals(other.getOriginalFile()))
            && (this.getMediaId() == null ? other.getMediaId() == null : this.getMediaId().equals(other.getMediaId()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getTotalHandleTimes() == null ? other.getTotalHandleTimes() == null : this.getTotalHandleTimes().equals(other.getTotalHandleTimes()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getWechatAppId() == null) ? 0 : getWechatAppId().hashCode());
        result = prime * result + ((getUploadApiType() == null) ? 0 : getUploadApiType().hashCode());
        result = prime * result + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        result = prime * result + ((getOriginalFile() == null) ? 0 : getOriginalFile().hashCode());
        result = prime * result + ((getMediaId() == null) ? 0 : getMediaId().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getTotalHandleTimes() == null) ? 0 : getTotalHandleTimes().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}