package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Similarityimage {
    private Long imageId;

    private String url;

    private String urlMd5;

    private String bodySha1;

    private Date bodyHashExpireTime;

    private Date createTime;

    private Date updateTime;

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrlMd5() {
        return urlMd5;
    }

    public void setUrlMd5(String urlMd5) {
        this.urlMd5 = urlMd5 == null ? null : urlMd5.trim();
    }

    public String getBodySha1() {
        return bodySha1;
    }

    public void setBodySha1(String bodySha1) {
        this.bodySha1 = bodySha1 == null ? null : bodySha1.trim();
    }

    public Date getBodyHashExpireTime() {
        return bodyHashExpireTime;
    }

    public void setBodyHashExpireTime(Date bodyHashExpireTime) {
        this.bodyHashExpireTime = bodyHashExpireTime;
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
        sb.append(", imageId=").append(imageId);
        sb.append(", url=").append(url);
        sb.append(", urlMd5=").append(urlMd5);
        sb.append(", bodySha1=").append(bodySha1);
        sb.append(", bodyHashExpireTime=").append(bodyHashExpireTime);
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
        Similarityimage other = (Similarityimage) that;
        return (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getUrlMd5() == null ? other.getUrlMd5() == null : this.getUrlMd5().equals(other.getUrlMd5()))
            && (this.getBodySha1() == null ? other.getBodySha1() == null : this.getBodySha1().equals(other.getBodySha1()))
            && (this.getBodyHashExpireTime() == null ? other.getBodyHashExpireTime() == null : this.getBodyHashExpireTime().equals(other.getBodyHashExpireTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getUrlMd5() == null) ? 0 : getUrlMd5().hashCode());
        result = prime * result + ((getBodySha1() == null) ? 0 : getBodySha1().hashCode());
        result = prime * result + ((getBodyHashExpireTime() == null) ? 0 : getBodyHashExpireTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}