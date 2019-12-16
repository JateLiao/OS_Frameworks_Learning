package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wechatuserfriends {
    private Long id;

    private Long wxuid;

    private Long friendWxuid;

    private String remarkName;

    private Byte friendStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWxuid() {
        return wxuid;
    }

    public void setWxuid(Long wxuid) {
        this.wxuid = wxuid;
    }

    public Long getFriendWxuid() {
        return friendWxuid;
    }

    public void setFriendWxuid(Long friendWxuid) {
        this.friendWxuid = friendWxuid;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName == null ? null : remarkName.trim();
    }

    public Byte getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(Byte friendStatus) {
        this.friendStatus = friendStatus;
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
        sb.append(", wxuid=").append(wxuid);
        sb.append(", friendWxuid=").append(friendWxuid);
        sb.append(", remarkName=").append(remarkName);
        sb.append(", friendStatus=").append(friendStatus);
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
        Wechatuserfriends other = (Wechatuserfriends) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWxuid() == null ? other.getWxuid() == null : this.getWxuid().equals(other.getWxuid()))
            && (this.getFriendWxuid() == null ? other.getFriendWxuid() == null : this.getFriendWxuid().equals(other.getFriendWxuid()))
            && (this.getRemarkName() == null ? other.getRemarkName() == null : this.getRemarkName().equals(other.getRemarkName()))
            && (this.getFriendStatus() == null ? other.getFriendStatus() == null : this.getFriendStatus().equals(other.getFriendStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWxuid() == null) ? 0 : getWxuid().hashCode());
        result = prime * result + ((getFriendWxuid() == null) ? 0 : getFriendWxuid().hashCode());
        result = prime * result + ((getRemarkName() == null) ? 0 : getRemarkName().hashCode());
        result = prime * result + ((getFriendStatus() == null) ? 0 : getFriendStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}