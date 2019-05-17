package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class OssBucketDo {
    private Integer seqId;

    private String purposeKey;

    private Byte providerId;

    private String bucketName;

    private String bucketDomain;

    private String bucketDomainProtocol;

    private String bucketPrefixPath;

    private String remark;

    private Byte privateFlag;

    private Integer expireTime;

    private Date createTime;

    private Date updateTime;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getPurposeKey() {
        return purposeKey;
    }

    public void setPurposeKey(String purposeKey) {
        this.purposeKey = purposeKey == null ? null : purposeKey.trim();
    }

    public Byte getProviderId() {
        return providerId;
    }

    public void setProviderId(Byte providerId) {
        this.providerId = providerId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName == null ? null : bucketName.trim();
    }

    public String getBucketDomain() {
        return bucketDomain;
    }

    public void setBucketDomain(String bucketDomain) {
        this.bucketDomain = bucketDomain == null ? null : bucketDomain.trim();
    }

    public String getBucketDomainProtocol() {
        return bucketDomainProtocol;
    }

    public void setBucketDomainProtocol(String bucketDomainProtocol) {
        this.bucketDomainProtocol = bucketDomainProtocol == null ? null : bucketDomainProtocol.trim();
    }

    public String getBucketPrefixPath() {
        return bucketPrefixPath;
    }

    public void setBucketPrefixPath(String bucketPrefixPath) {
        this.bucketPrefixPath = bucketPrefixPath == null ? null : bucketPrefixPath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(Byte privateFlag) {
        this.privateFlag = privateFlag;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
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
        sb.append(", seqId=").append(seqId);
        sb.append(", purposeKey=").append(purposeKey);
        sb.append(", providerId=").append(providerId);
        sb.append(", bucketName=").append(bucketName);
        sb.append(", bucketDomain=").append(bucketDomain);
        sb.append(", bucketDomainProtocol=").append(bucketDomainProtocol);
        sb.append(", bucketPrefixPath=").append(bucketPrefixPath);
        sb.append(", remark=").append(remark);
        sb.append(", privateFlag=").append(privateFlag);
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
        OssBucketDo other = (OssBucketDo) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getPurposeKey() == null ? other.getPurposeKey() == null : this.getPurposeKey().equals(other.getPurposeKey()))
            && (this.getProviderId() == null ? other.getProviderId() == null : this.getProviderId().equals(other.getProviderId()))
            && (this.getBucketName() == null ? other.getBucketName() == null : this.getBucketName().equals(other.getBucketName()))
            && (this.getBucketDomain() == null ? other.getBucketDomain() == null : this.getBucketDomain().equals(other.getBucketDomain()))
            && (this.getBucketDomainProtocol() == null ? other.getBucketDomainProtocol() == null : this.getBucketDomainProtocol().equals(other.getBucketDomainProtocol()))
            && (this.getBucketPrefixPath() == null ? other.getBucketPrefixPath() == null : this.getBucketPrefixPath().equals(other.getBucketPrefixPath()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPrivateFlag() == null ? other.getPrivateFlag() == null : this.getPrivateFlag().equals(other.getPrivateFlag()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getPurposeKey() == null) ? 0 : getPurposeKey().hashCode());
        result = prime * result + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        result = prime * result + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        result = prime * result + ((getBucketDomain() == null) ? 0 : getBucketDomain().hashCode());
        result = prime * result + ((getBucketDomainProtocol() == null) ? 0 : getBucketDomainProtocol().hashCode());
        result = prime * result + ((getBucketPrefixPath() == null) ? 0 : getBucketPrefixPath().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPrivateFlag() == null) ? 0 : getPrivateFlag().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}