package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Lesson {
    private Integer id;

    private String key;

    private Integer chapterId;

    private Byte type;

    private String name;

    private Integer durationTime;

    private String pushText;

    private Byte hasParentChildLesson;

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

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    public String getPushText() {
        return pushText;
    }

    public void setPushText(String pushText) {
        this.pushText = pushText == null ? null : pushText.trim();
    }

    public Byte getHasParentChildLesson() {
        return hasParentChildLesson;
    }

    public void setHasParentChildLesson(Byte hasParentChildLesson) {
        this.hasParentChildLesson = hasParentChildLesson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", key=").append(key);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", durationTime=").append(durationTime);
        sb.append(", pushText=").append(pushText);
        sb.append(", hasParentChildLesson=").append(hasParentChildLesson);
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
        Lesson other = (Lesson) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getChapterId() == null ? other.getChapterId() == null : this.getChapterId().equals(other.getChapterId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDurationTime() == null ? other.getDurationTime() == null : this.getDurationTime().equals(other.getDurationTime()))
            && (this.getPushText() == null ? other.getPushText() == null : this.getPushText().equals(other.getPushText()))
            && (this.getHasParentChildLesson() == null ? other.getHasParentChildLesson() == null : this.getHasParentChildLesson().equals(other.getHasParentChildLesson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getChapterId() == null) ? 0 : getChapterId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDurationTime() == null) ? 0 : getDurationTime().hashCode());
        result = prime * result + ((getPushText() == null) ? 0 : getPushText().hashCode());
        result = prime * result + ((getHasParentChildLesson() == null) ? 0 : getHasParentChildLesson().hashCode());
        return result;
    }
}