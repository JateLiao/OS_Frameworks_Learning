package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Configcommentlesson {
    private Integer id;

    private String subjectKey;

    private String lessonKey;

    private Byte needComment;

    private String allCorrectComment;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectKey() {
        return subjectKey;
    }

    public void setSubjectKey(String subjectKey) {
        this.subjectKey = subjectKey == null ? null : subjectKey.trim();
    }

    public String getLessonKey() {
        return lessonKey;
    }

    public void setLessonKey(String lessonKey) {
        this.lessonKey = lessonKey == null ? null : lessonKey.trim();
    }

    public Byte getNeedComment() {
        return needComment;
    }

    public void setNeedComment(Byte needComment) {
        this.needComment = needComment;
    }

    public String getAllCorrectComment() {
        return allCorrectComment;
    }

    public void setAllCorrectComment(String allCorrectComment) {
        this.allCorrectComment = allCorrectComment == null ? null : allCorrectComment.trim();
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
        sb.append(", subjectKey=").append(subjectKey);
        sb.append(", lessonKey=").append(lessonKey);
        sb.append(", needComment=").append(needComment);
        sb.append(", allCorrectComment=").append(allCorrectComment);
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
        Configcommentlesson other = (Configcommentlesson) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubjectKey() == null ? other.getSubjectKey() == null : this.getSubjectKey().equals(other.getSubjectKey()))
            && (this.getLessonKey() == null ? other.getLessonKey() == null : this.getLessonKey().equals(other.getLessonKey()))
            && (this.getNeedComment() == null ? other.getNeedComment() == null : this.getNeedComment().equals(other.getNeedComment()))
            && (this.getAllCorrectComment() == null ? other.getAllCorrectComment() == null : this.getAllCorrectComment().equals(other.getAllCorrectComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubjectKey() == null) ? 0 : getSubjectKey().hashCode());
        result = prime * result + ((getLessonKey() == null) ? 0 : getLessonKey().hashCode());
        result = prime * result + ((getNeedComment() == null) ? 0 : getNeedComment().hashCode());
        result = prime * result + ((getAllCorrectComment() == null) ? 0 : getAllCorrectComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}