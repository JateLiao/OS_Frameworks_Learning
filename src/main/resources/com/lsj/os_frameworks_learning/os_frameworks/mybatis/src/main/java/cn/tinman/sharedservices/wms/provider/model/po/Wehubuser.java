package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wehubuser {
    private Long whuid;

    private Long wxuid;

    private Byte allowLogin;

    private Date lastReportTime;

    private Byte callbackType;

    private Long whgid;

    private Date createTime;

    private Date updateTime;

    public Long getWhuid() {
        return whuid;
    }

    public void setWhuid(Long whuid) {
        this.whuid = whuid;
    }

    public Long getWxuid() {
        return wxuid;
    }

    public void setWxuid(Long wxuid) {
        this.wxuid = wxuid;
    }

    public Byte getAllowLogin() {
        return allowLogin;
    }

    public void setAllowLogin(Byte allowLogin) {
        this.allowLogin = allowLogin;
    }

    public Date getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(Date lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public Byte getCallbackType() {
        return callbackType;
    }

    public void setCallbackType(Byte callbackType) {
        this.callbackType = callbackType;
    }

    public Long getWhgid() {
        return whgid;
    }

    public void setWhgid(Long whgid) {
        this.whgid = whgid;
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
        sb.append(", whuid=").append(whuid);
        sb.append(", wxuid=").append(wxuid);
        sb.append(", allowLogin=").append(allowLogin);
        sb.append(", lastReportTime=").append(lastReportTime);
        sb.append(", callbackType=").append(callbackType);
        sb.append(", whgid=").append(whgid);
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
        Wehubuser other = (Wehubuser) that;
        return (this.getWhuid() == null ? other.getWhuid() == null : this.getWhuid().equals(other.getWhuid()))
            && (this.getWxuid() == null ? other.getWxuid() == null : this.getWxuid().equals(other.getWxuid()))
            && (this.getAllowLogin() == null ? other.getAllowLogin() == null : this.getAllowLogin().equals(other.getAllowLogin()))
            && (this.getLastReportTime() == null ? other.getLastReportTime() == null : this.getLastReportTime().equals(other.getLastReportTime()))
            && (this.getCallbackType() == null ? other.getCallbackType() == null : this.getCallbackType().equals(other.getCallbackType()))
            && (this.getWhgid() == null ? other.getWhgid() == null : this.getWhgid().equals(other.getWhgid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWhuid() == null) ? 0 : getWhuid().hashCode());
        result = prime * result + ((getWxuid() == null) ? 0 : getWxuid().hashCode());
        result = prime * result + ((getAllowLogin() == null) ? 0 : getAllowLogin().hashCode());
        result = prime * result + ((getLastReportTime() == null) ? 0 : getLastReportTime().hashCode());
        result = prime * result + ((getCallbackType() == null) ? 0 : getCallbackType().hashCode());
        result = prime * result + ((getWhgid() == null) ? 0 : getWhgid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}