package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wehubusertaskconfig {
    private Long id;

    private Long whuid;

    private Byte taskType;

    private Integer intervalMin;

    private Integer intervalMax;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWhuid() {
        return whuid;
    }

    public void setWhuid(Long whuid) {
        this.whuid = whuid;
    }

    public Byte getTaskType() {
        return taskType;
    }

    public void setTaskType(Byte taskType) {
        this.taskType = taskType;
    }

    public Integer getIntervalMin() {
        return intervalMin;
    }

    public void setIntervalMin(Integer intervalMin) {
        this.intervalMin = intervalMin;
    }

    public Integer getIntervalMax() {
        return intervalMax;
    }

    public void setIntervalMax(Integer intervalMax) {
        this.intervalMax = intervalMax;
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
        sb.append(", whuid=").append(whuid);
        sb.append(", taskType=").append(taskType);
        sb.append(", intervalMin=").append(intervalMin);
        sb.append(", intervalMax=").append(intervalMax);
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
        Wehubusertaskconfig other = (Wehubusertaskconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWhuid() == null ? other.getWhuid() == null : this.getWhuid().equals(other.getWhuid()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getIntervalMin() == null ? other.getIntervalMin() == null : this.getIntervalMin().equals(other.getIntervalMin()))
            && (this.getIntervalMax() == null ? other.getIntervalMax() == null : this.getIntervalMax().equals(other.getIntervalMax()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWhuid() == null) ? 0 : getWhuid().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getIntervalMin() == null) ? 0 : getIntervalMin().hashCode());
        result = prime * result + ((getIntervalMax() == null) ? 0 : getIntervalMax().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}