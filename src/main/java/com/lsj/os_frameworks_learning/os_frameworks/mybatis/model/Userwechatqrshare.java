package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userwechatqrshare {
    private Long id;

    private Integer userId;

    private String wechatAppId;

    private Byte sceneType;

    private String scene;

    private String targetPagePath;

    private String sourcePagePath;

    private String qrImage;

    private String additionalData;

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

    public Byte getSceneType() {
        return sceneType;
    }

    public void setSceneType(Byte sceneType) {
        this.sceneType = sceneType;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getTargetPagePath() {
        return targetPagePath;
    }

    public void setTargetPagePath(String targetPagePath) {
        this.targetPagePath = targetPagePath == null ? null : targetPagePath.trim();
    }

    public String getSourcePagePath() {
        return sourcePagePath;
    }

    public void setSourcePagePath(String sourcePagePath) {
        this.sourcePagePath = sourcePagePath == null ? null : sourcePagePath.trim();
    }

    public String getQrImage() {
        return qrImage;
    }

    public void setQrImage(String qrImage) {
        this.qrImage = qrImage == null ? null : qrImage.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", sceneType=").append(sceneType);
        sb.append(", scene=").append(scene);
        sb.append(", targetPagePath=").append(targetPagePath);
        sb.append(", sourcePagePath=").append(sourcePagePath);
        sb.append(", qrImage=").append(qrImage);
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
        Userwechatqrshare other = (Userwechatqrshare) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getSceneType() == null ? other.getSceneType() == null : this.getSceneType().equals(other.getSceneType()))
            && (this.getScene() == null ? other.getScene() == null : this.getScene().equals(other.getScene()))
            && (this.getTargetPagePath() == null ? other.getTargetPagePath() == null : this.getTargetPagePath().equals(other.getTargetPagePath()))
            && (this.getSourcePagePath() == null ? other.getSourcePagePath() == null : this.getSourcePagePath().equals(other.getSourcePagePath()))
            && (this.getQrImage() == null ? other.getQrImage() == null : this.getQrImage().equals(other.getQrImage()))
            && (this.getAdditionalData() == null ? other.getAdditionalData() == null : this.getAdditionalData().equals(other.getAdditionalData()))
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
        result = prime * result + ((getSceneType() == null) ? 0 : getSceneType().hashCode());
        result = prime * result + ((getScene() == null) ? 0 : getScene().hashCode());
        result = prime * result + ((getTargetPagePath() == null) ? 0 : getTargetPagePath().hashCode());
        result = prime * result + ((getSourcePagePath() == null) ? 0 : getSourcePagePath().hashCode());
        result = prime * result + ((getQrImage() == null) ? 0 : getQrImage().hashCode());
        result = prime * result + ((getAdditionalData() == null) ? 0 : getAdditionalData().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}