package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Productpointsgiftsku {
    private Integer id;

    private String key;

    private String name;

    private Integer productId;

    private Integer originalPoints;

    private Integer currentPoints;

    private String entranceImage;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOriginalPoints() {
        return originalPoints;
    }

    public void setOriginalPoints(Integer originalPoints) {
        this.originalPoints = originalPoints;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    public String getEntranceImage() {
        return entranceImage;
    }

    public void setEntranceImage(String entranceImage) {
        this.entranceImage = entranceImage == null ? null : entranceImage.trim();
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
        sb.append(", name=").append(name);
        sb.append(", productId=").append(productId);
        sb.append(", originalPoints=").append(originalPoints);
        sb.append(", currentPoints=").append(currentPoints);
        sb.append(", entranceImage=").append(entranceImage);
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
        Productpointsgiftsku other = (Productpointsgiftsku) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getOriginalPoints() == null ? other.getOriginalPoints() == null : this.getOriginalPoints().equals(other.getOriginalPoints()))
            && (this.getCurrentPoints() == null ? other.getCurrentPoints() == null : this.getCurrentPoints().equals(other.getCurrentPoints()))
            && (this.getEntranceImage() == null ? other.getEntranceImage() == null : this.getEntranceImage().equals(other.getEntranceImage()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getOriginalPoints() == null) ? 0 : getOriginalPoints().hashCode());
        result = prime * result + ((getCurrentPoints() == null) ? 0 : getCurrentPoints().hashCode());
        result = prime * result + ((getEntranceImage() == null) ? 0 : getEntranceImage().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}