package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Courselesson {
    private Integer id;

    private Integer courseId;

    private Integer lessonId;

    private Integer lessonOrder;

    private Integer startTime;

    private Integer courseSegmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getLessonOrder() {
        return lessonOrder;
    }

    public void setLessonOrder(Integer lessonOrder) {
        this.lessonOrder = lessonOrder;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getCourseSegmentId() {
        return courseSegmentId;
    }

    public void setCourseSegmentId(Integer courseSegmentId) {
        this.courseSegmentId = courseSegmentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", lessonId=").append(lessonId);
        sb.append(", lessonOrder=").append(lessonOrder);
        sb.append(", startTime=").append(startTime);
        sb.append(", courseSegmentId=").append(courseSegmentId);
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
        Courselesson other = (Courselesson) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getLessonId() == null ? other.getLessonId() == null : this.getLessonId().equals(other.getLessonId()))
            && (this.getLessonOrder() == null ? other.getLessonOrder() == null : this.getLessonOrder().equals(other.getLessonOrder()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getCourseSegmentId() == null ? other.getCourseSegmentId() == null : this.getCourseSegmentId().equals(other.getCourseSegmentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getLessonId() == null) ? 0 : getLessonId().hashCode());
        result = prime * result + ((getLessonOrder() == null) ? 0 : getLessonOrder().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getCourseSegmentId() == null) ? 0 : getCourseSegmentId().hashCode());
        return result;
    }
}