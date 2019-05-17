package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Coursesegment {
    private Integer id;

    private Integer courseId;

    private String segmentKey;

    private String segmentName;

    private String segmentDescription;

    private Integer segmentOrder;

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

    public String getSegmentKey() {
        return segmentKey;
    }

    public void setSegmentKey(String segmentKey) {
        this.segmentKey = segmentKey == null ? null : segmentKey.trim();
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName == null ? null : segmentName.trim();
    }

    public String getSegmentDescription() {
        return segmentDescription;
    }

    public void setSegmentDescription(String segmentDescription) {
        this.segmentDescription = segmentDescription == null ? null : segmentDescription.trim();
    }

    public Integer getSegmentOrder() {
        return segmentOrder;
    }

    public void setSegmentOrder(Integer segmentOrder) {
        this.segmentOrder = segmentOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", segmentKey=").append(segmentKey);
        sb.append(", segmentName=").append(segmentName);
        sb.append(", segmentDescription=").append(segmentDescription);
        sb.append(", segmentOrder=").append(segmentOrder);
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
        Coursesegment other = (Coursesegment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getSegmentKey() == null ? other.getSegmentKey() == null : this.getSegmentKey().equals(other.getSegmentKey()))
            && (this.getSegmentName() == null ? other.getSegmentName() == null : this.getSegmentName().equals(other.getSegmentName()))
            && (this.getSegmentDescription() == null ? other.getSegmentDescription() == null : this.getSegmentDescription().equals(other.getSegmentDescription()))
            && (this.getSegmentOrder() == null ? other.getSegmentOrder() == null : this.getSegmentOrder().equals(other.getSegmentOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getSegmentKey() == null) ? 0 : getSegmentKey().hashCode());
        result = prime * result + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        result = prime * result + ((getSegmentDescription() == null) ? 0 : getSegmentDescription().hashCode());
        result = prime * result + ((getSegmentOrder() == null) ? 0 : getSegmentOrder().hashCode());
        return result;
    }
}