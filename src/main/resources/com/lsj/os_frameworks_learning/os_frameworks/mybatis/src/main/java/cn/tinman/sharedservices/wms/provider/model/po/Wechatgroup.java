package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wechatgroup {
    private Long wxgid;

    private String wxid;

    private String name;

    private Long ownerWxuid;

    private Date createTime;

    private Date updateTime;

    public Long getWxgid() {
        return wxgid;
    }

    public void setWxgid(Long wxgid) {
        this.wxgid = wxgid;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getOwnerWxuid() {
        return ownerWxuid;
    }

    public void setOwnerWxuid(Long ownerWxuid) {
        this.ownerWxuid = ownerWxuid;
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
        sb.append(", wxgid=").append(wxgid);
        sb.append(", wxid=").append(wxid);
        sb.append(", name=").append(name);
        sb.append(", ownerWxuid=").append(ownerWxuid);
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
        Wechatgroup other = (Wechatgroup) that;
        return (this.getWxgid() == null ? other.getWxgid() == null : this.getWxgid().equals(other.getWxgid()))
            && (this.getWxid() == null ? other.getWxid() == null : this.getWxid().equals(other.getWxid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOwnerWxuid() == null ? other.getOwnerWxuid() == null : this.getOwnerWxuid().equals(other.getOwnerWxuid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWxgid() == null) ? 0 : getWxgid().hashCode());
        result = prime * result + ((getWxid() == null) ? 0 : getWxid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOwnerWxuid() == null) ? 0 : getOwnerWxuid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}