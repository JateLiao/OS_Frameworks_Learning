package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Class {
    private Integer id;

    private String key;

    private String name;

    private Integer courseId;

    private Date applyEndTime;

    private Date createTime;

    private Date updateTime;

    private Byte autoCreate;

    private Byte isLimit;

    private Integer limitNum;

    private Byte isExperience;

    private Byte isPresent;

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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getApplyEndTime() {
        return applyEndTime;
    }

    public void setApplyEndTime(Date applyEndTime) {
        this.applyEndTime = applyEndTime;
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

    public Byte getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(Byte autoCreate) {
        this.autoCreate = autoCreate;
    }

    public Byte getIsLimit() {
        return isLimit;
    }

    public void setIsLimit(Byte isLimit) {
        this.isLimit = isLimit;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Byte getIsExperience() {
        return isExperience;
    }

    public void setIsExperience(Byte isExperience) {
        this.isExperience = isExperience;
    }

    public Byte getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Byte isPresent) {
        this.isPresent = isPresent;
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
        sb.append(", courseId=").append(courseId);
        sb.append(", applyEndTime=").append(applyEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", autoCreate=").append(autoCreate);
        sb.append(", isLimit=").append(isLimit);
        sb.append(", limitNum=").append(limitNum);
        sb.append(", isExperience=").append(isExperience);
        sb.append(", isPresent=").append(isPresent);
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
        Class other = (Class) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getApplyEndTime() == null ? other.getApplyEndTime() == null : this.getApplyEndTime().equals(other.getApplyEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAutoCreate() == null ? other.getAutoCreate() == null : this.getAutoCreate().equals(other.getAutoCreate()))
            && (this.getIsLimit() == null ? other.getIsLimit() == null : this.getIsLimit().equals(other.getIsLimit()))
            && (this.getLimitNum() == null ? other.getLimitNum() == null : this.getLimitNum().equals(other.getLimitNum()))
            && (this.getIsExperience() == null ? other.getIsExperience() == null : this.getIsExperience().equals(other.getIsExperience()))
            && (this.getIsPresent() == null ? other.getIsPresent() == null : this.getIsPresent().equals(other.getIsPresent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getApplyEndTime() == null) ? 0 : getApplyEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAutoCreate() == null) ? 0 : getAutoCreate().hashCode());
        result = prime * result + ((getIsLimit() == null) ? 0 : getIsLimit().hashCode());
        result = prime * result + ((getLimitNum() == null) ? 0 : getLimitNum().hashCode());
        result = prime * result + ((getIsExperience() == null) ? 0 : getIsExperience().hashCode());
        result = prime * result + ((getIsPresent() == null) ? 0 : getIsPresent().hashCode());
        return result;
    }
}