package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wechatgroupmember {
    private Long id;

    private Long wxgid;

    private Long memberWxuid;

    private String groupNickname;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWxgid() {
        return wxgid;
    }

    public void setWxgid(Long wxgid) {
        this.wxgid = wxgid;
    }

    public Long getMemberWxuid() {
        return memberWxuid;
    }

    public void setMemberWxuid(Long memberWxuid) {
        this.memberWxuid = memberWxuid;
    }

    public String getGroupNickname() {
        return groupNickname;
    }

    public void setGroupNickname(String groupNickname) {
        this.groupNickname = groupNickname == null ? null : groupNickname.trim();
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
        sb.append(", wxgid=").append(wxgid);
        sb.append(", memberWxuid=").append(memberWxuid);
        sb.append(", groupNickname=").append(groupNickname);
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
        Wechatgroupmember other = (Wechatgroupmember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWxgid() == null ? other.getWxgid() == null : this.getWxgid().equals(other.getWxgid()))
            && (this.getMemberWxuid() == null ? other.getMemberWxuid() == null : this.getMemberWxuid().equals(other.getMemberWxuid()))
            && (this.getGroupNickname() == null ? other.getGroupNickname() == null : this.getGroupNickname().equals(other.getGroupNickname()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWxgid() == null) ? 0 : getWxgid().hashCode());
        result = prime * result + ((getMemberWxuid() == null) ? 0 : getMemberWxuid().hashCode());
        result = prime * result + ((getGroupNickname() == null) ? 0 : getGroupNickname().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}