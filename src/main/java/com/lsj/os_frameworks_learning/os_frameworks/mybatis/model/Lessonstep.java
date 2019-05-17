package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Lessonstep {
    private Integer id;

    private Integer lessonId;

    private String name;

    private Byte type;

    private Integer showOrder;

    private Byte needFinish;

    private Byte needReport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Byte getNeedFinish() {
        return needFinish;
    }

    public void setNeedFinish(Byte needFinish) {
        this.needFinish = needFinish;
    }

    public Byte getNeedReport() {
        return needReport;
    }

    public void setNeedReport(Byte needReport) {
        this.needReport = needReport;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lessonId=").append(lessonId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", showOrder=").append(showOrder);
        sb.append(", needFinish=").append(needFinish);
        sb.append(", needReport=").append(needReport);
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
        Lessonstep other = (Lessonstep) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLessonId() == null ? other.getLessonId() == null : this.getLessonId().equals(other.getLessonId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getShowOrder() == null ? other.getShowOrder() == null : this.getShowOrder().equals(other.getShowOrder()))
            && (this.getNeedFinish() == null ? other.getNeedFinish() == null : this.getNeedFinish().equals(other.getNeedFinish()))
            && (this.getNeedReport() == null ? other.getNeedReport() == null : this.getNeedReport().equals(other.getNeedReport()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLessonId() == null) ? 0 : getLessonId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getShowOrder() == null) ? 0 : getShowOrder().hashCode());
        result = prime * result + ((getNeedFinish() == null) ? 0 : getNeedFinish().hashCode());
        result = prime * result + ((getNeedReport() == null) ? 0 : getNeedReport().hashCode());
        return result;
    }
}