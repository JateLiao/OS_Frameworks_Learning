package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Course {
    private Integer id;

    private String key;

    private String name;

    private Byte isExperience;

    private Integer bookCount;

    private Byte isPart;

    private String brief;

    private String entranceImage;

    private String entranceImageSmall;

    private String introduceImage;

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

    public Byte getIsExperience() {
        return isExperience;
    }

    public void setIsExperience(Byte isExperience) {
        this.isExperience = isExperience;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public Byte getIsPart() {
        return isPart;
    }

    public void setIsPart(Byte isPart) {
        this.isPart = isPart;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getEntranceImage() {
        return entranceImage;
    }

    public void setEntranceImage(String entranceImage) {
        this.entranceImage = entranceImage == null ? null : entranceImage.trim();
    }

    public String getEntranceImageSmall() {
        return entranceImageSmall;
    }

    public void setEntranceImageSmall(String entranceImageSmall) {
        this.entranceImageSmall = entranceImageSmall == null ? null : entranceImageSmall.trim();
    }

    public String getIntroduceImage() {
        return introduceImage;
    }

    public void setIntroduceImage(String introduceImage) {
        this.introduceImage = introduceImage == null ? null : introduceImage.trim();
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
        sb.append(", isExperience=").append(isExperience);
        sb.append(", bookCount=").append(bookCount);
        sb.append(", isPart=").append(isPart);
        sb.append(", brief=").append(brief);
        sb.append(", entranceImage=").append(entranceImage);
        sb.append(", entranceImageSmall=").append(entranceImageSmall);
        sb.append(", introduceImage=").append(introduceImage);
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
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIsExperience() == null ? other.getIsExperience() == null : this.getIsExperience().equals(other.getIsExperience()))
            && (this.getBookCount() == null ? other.getBookCount() == null : this.getBookCount().equals(other.getBookCount()))
            && (this.getIsPart() == null ? other.getIsPart() == null : this.getIsPart().equals(other.getIsPart()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getEntranceImage() == null ? other.getEntranceImage() == null : this.getEntranceImage().equals(other.getEntranceImage()))
            && (this.getEntranceImageSmall() == null ? other.getEntranceImageSmall() == null : this.getEntranceImageSmall().equals(other.getEntranceImageSmall()))
            && (this.getIntroduceImage() == null ? other.getIntroduceImage() == null : this.getIntroduceImage().equals(other.getIntroduceImage()))
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
        result = prime * result + ((getIsExperience() == null) ? 0 : getIsExperience().hashCode());
        result = prime * result + ((getBookCount() == null) ? 0 : getBookCount().hashCode());
        result = prime * result + ((getIsPart() == null) ? 0 : getIsPart().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getEntranceImage() == null) ? 0 : getEntranceImage().hashCode());
        result = prime * result + ((getEntranceImageSmall() == null) ? 0 : getEntranceImageSmall().hashCode());
        result = prime * result + ((getIntroduceImage() == null) ? 0 : getIntroduceImage().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}