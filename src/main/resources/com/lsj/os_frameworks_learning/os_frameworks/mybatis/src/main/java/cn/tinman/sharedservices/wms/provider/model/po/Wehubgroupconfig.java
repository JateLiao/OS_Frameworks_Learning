package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wehubgroupconfig {
    private Long whgid;

    private Byte callbackType;

    private String callbackUrl;

    private Integer heartbeatInterval;

    private Date createTime;

    private Date updateTime;

    public Long getWhgid() {
        return whgid;
    }

    public void setWhgid(Long whgid) {
        this.whgid = whgid;
    }

    public Byte getCallbackType() {
        return callbackType;
    }

    public void setCallbackType(Byte callbackType) {
        this.callbackType = callbackType;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    public Integer getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public void setHeartbeatInterval(Integer heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
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
        sb.append(", whgid=").append(whgid);
        sb.append(", callbackType=").append(callbackType);
        sb.append(", callbackUrl=").append(callbackUrl);
        sb.append(", heartbeatInterval=").append(heartbeatInterval);
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
        Wehubgroupconfig other = (Wehubgroupconfig) that;
        return (this.getWhgid() == null ? other.getWhgid() == null : this.getWhgid().equals(other.getWhgid()))
            && (this.getCallbackType() == null ? other.getCallbackType() == null : this.getCallbackType().equals(other.getCallbackType()))
            && (this.getCallbackUrl() == null ? other.getCallbackUrl() == null : this.getCallbackUrl().equals(other.getCallbackUrl()))
            && (this.getHeartbeatInterval() == null ? other.getHeartbeatInterval() == null : this.getHeartbeatInterval().equals(other.getHeartbeatInterval()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWhgid() == null) ? 0 : getWhgid().hashCode());
        result = prime * result + ((getCallbackType() == null) ? 0 : getCallbackType().hashCode());
        result = prime * result + ((getCallbackUrl() == null) ? 0 : getCallbackUrl().hashCode());
        result = prime * result + ((getHeartbeatInterval() == null) ? 0 : getHeartbeatInterval().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}