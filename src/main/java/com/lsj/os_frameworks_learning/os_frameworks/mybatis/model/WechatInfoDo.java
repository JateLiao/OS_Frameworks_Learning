package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class WechatInfoDo {
    private Integer seqId;

    private String wechatAppName;

    private String wechatAppId;

    private String wechatSecret;

    private Byte wechatAppType;

    private Byte wechatDefaultMpFlag;

    private String wechatRawId;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getWechatAppName() {
        return wechatAppName;
    }

    public void setWechatAppName(String wechatAppName) {
        this.wechatAppName = wechatAppName == null ? null : wechatAppName.trim();
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId == null ? null : wechatAppId.trim();
    }

    public String getWechatSecret() {
        return wechatSecret;
    }

    public void setWechatSecret(String wechatSecret) {
        this.wechatSecret = wechatSecret == null ? null : wechatSecret.trim();
    }

    public Byte getWechatAppType() {
        return wechatAppType;
    }

    public void setWechatAppType(Byte wechatAppType) {
        this.wechatAppType = wechatAppType;
    }

    public Byte getWechatDefaultMpFlag() {
        return wechatDefaultMpFlag;
    }

    public void setWechatDefaultMpFlag(Byte wechatDefaultMpFlag) {
        this.wechatDefaultMpFlag = wechatDefaultMpFlag;
    }

    public String getWechatRawId() {
        return wechatRawId;
    }

    public void setWechatRawId(String wechatRawId) {
        this.wechatRawId = wechatRawId == null ? null : wechatRawId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqId=").append(seqId);
        sb.append(", wechatAppName=").append(wechatAppName);
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", wechatSecret=").append(wechatSecret);
        sb.append(", wechatAppType=").append(wechatAppType);
        sb.append(", wechatDefaultMpFlag=").append(wechatDefaultMpFlag);
        sb.append(", wechatRawId=").append(wechatRawId);
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
        WechatInfoDo other = (WechatInfoDo) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getWechatAppName() == null ? other.getWechatAppName() == null : this.getWechatAppName().equals(other.getWechatAppName()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getWechatSecret() == null ? other.getWechatSecret() == null : this.getWechatSecret().equals(other.getWechatSecret()))
            && (this.getWechatAppType() == null ? other.getWechatAppType() == null : this.getWechatAppType().equals(other.getWechatAppType()))
            && (this.getWechatDefaultMpFlag() == null ? other.getWechatDefaultMpFlag() == null : this.getWechatDefaultMpFlag().equals(other.getWechatDefaultMpFlag()))
            && (this.getWechatRawId() == null ? other.getWechatRawId() == null : this.getWechatRawId().equals(other.getWechatRawId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getWechatAppName() == null) ? 0 : getWechatAppName().hashCode());
        result = prime * result + ((getWechatAppId() == null) ? 0 : getWechatAppId().hashCode());
        result = prime * result + ((getWechatSecret() == null) ? 0 : getWechatSecret().hashCode());
        result = prime * result + ((getWechatAppType() == null) ? 0 : getWechatAppType().hashCode());
        result = prime * result + ((getWechatDefaultMpFlag() == null) ? 0 : getWechatDefaultMpFlag().hashCode());
        result = prime * result + ((getWechatRawId() == null) ? 0 : getWechatRawId().hashCode());
        return result;
    }
}