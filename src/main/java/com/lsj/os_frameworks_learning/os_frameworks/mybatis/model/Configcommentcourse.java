package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Configcommentcourse {
    private Integer id;

    private String courseKey;

    private Byte needComment;

    private Date createTime;

    private Date upateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseKey() {
        return courseKey;
    }

    public void setCourseKey(String courseKey) {
        this.courseKey = courseKey == null ? null : courseKey.trim();
    }

    public Byte getNeedComment() {
        return needComment;
    }

    public void setNeedComment(Byte needComment) {
        this.needComment = needComment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseKey=").append(courseKey);
        sb.append(", needComment=").append(needComment);
        sb.append(", createTime=").append(createTime);
        sb.append(", upateTime=").append(upateTime);
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
        Configcommentcourse other = (Configcommentcourse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseKey() == null ? other.getCourseKey() == null : this.getCourseKey().equals(other.getCourseKey()))
            && (this.getNeedComment() == null ? other.getNeedComment() == null : this.getNeedComment().equals(other.getNeedComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpateTime() == null ? other.getUpateTime() == null : this.getUpateTime().equals(other.getUpateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseKey() == null) ? 0 : getCourseKey().hashCode());
        result = prime * result + ((getNeedComment() == null) ? 0 : getNeedComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpateTime() == null) ? 0 : getUpateTime().hashCode());
        return result;
    }
}