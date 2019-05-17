package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Userwechatmpqr {
    private Long id;

    private String wechatAppId;

    private Integer userId;

    private Byte sceneType;

    private String scene;

    private Byte isTempQr;

    private String qrTicket;

    private String qrImage;

    private Date expireTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId == null ? null : wechatAppId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Byte getIsTempQr() {
        return isTempQr;
    }

    public void setIsTempQr(Byte isTempQr) {
        this.isTempQr = isTempQr;
    }

    public String getQrTicket() {
        return qrTicket;
    }

    public void setQrTicket(String qrTicket) {
        this.qrTicket = qrTicket == null ? null : qrTicket.trim();
    }

    public String getQrImage() {
        return qrImage;
    }

    public void setQrImage(String qrImage) {
        this.qrImage = qrImage == null ? null : qrImage.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", userId=").append(userId);
        sb.append(", sceneType=").append(sceneType);
        sb.append(", scene=").append(scene);
        sb.append(", isTempQr=").append(isTempQr);
        sb.append(", qrTicket=").append(qrTicket);
        sb.append(", qrImage=").append(qrImage);
        sb.append(", expireTime=").append(expireTime);
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
        Userwechatmpqr other = (Userwechatmpqr) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSceneType() == null ? other.getSceneType() == null : this.getSceneType().equals(other.getSceneType()))
            && (this.getScene() == null ? other.getScene() == null : this.getScene().equals(other.getScene()))
            && (this.getIsTempQr() == null ? other.getIsTempQr() == null : this.getIsTempQr().equals(other.getIsTempQr()))
            && (this.getQrTicket() == null ? other.getQrTicket() == null : this.getQrTicket().equals(other.getQrTicket()))
            && (this.getQrImage() == null ? other.getQrImage() == null : this.getQrImage().equals(other.getQrImage()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWechatAppId() == null) ? 0 : getWechatAppId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSceneType() == null) ? 0 : getSceneType().hashCode());
        result = prime * result + ((getScene() == null) ? 0 : getScene().hashCode());
        result = prime * result + ((getIsTempQr() == null) ? 0 : getIsTempQr().hashCode());
        result = prime * result + ((getQrTicket() == null) ? 0 : getQrTicket().hashCode());
        result = prime * result + ((getQrImage() == null) ? 0 : getQrImage().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}