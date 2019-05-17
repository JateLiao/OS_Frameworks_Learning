package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Usercourseaffiliateinvite {
    private Integer id;

    private Integer affId;

    private Integer inviterUserId;

    private Integer inviteeUserId;

    private Byte inviteStatus;

    private Integer validCount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAffId() {
        return affId;
    }

    public void setAffId(Integer affId) {
        this.affId = affId;
    }

    public Integer getInviterUserId() {
        return inviterUserId;
    }

    public void setInviterUserId(Integer inviterUserId) {
        this.inviterUserId = inviterUserId;
    }

    public Integer getInviteeUserId() {
        return inviteeUserId;
    }

    public void setInviteeUserId(Integer inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
    }

    public Byte getInviteStatus() {
        return inviteStatus;
    }

    public void setInviteStatus(Byte inviteStatus) {
        this.inviteStatus = inviteStatus;
    }

    public Integer getValidCount() {
        return validCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
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
        sb.append(", affId=").append(affId);
        sb.append(", inviterUserId=").append(inviterUserId);
        sb.append(", inviteeUserId=").append(inviteeUserId);
        sb.append(", inviteStatus=").append(inviteStatus);
        sb.append(", validCount=").append(validCount);
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
        Usercourseaffiliateinvite other = (Usercourseaffiliateinvite) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAffId() == null ? other.getAffId() == null : this.getAffId().equals(other.getAffId()))
            && (this.getInviterUserId() == null ? other.getInviterUserId() == null : this.getInviterUserId().equals(other.getInviterUserId()))
            && (this.getInviteeUserId() == null ? other.getInviteeUserId() == null : this.getInviteeUserId().equals(other.getInviteeUserId()))
            && (this.getInviteStatus() == null ? other.getInviteStatus() == null : this.getInviteStatus().equals(other.getInviteStatus()))
            && (this.getValidCount() == null ? other.getValidCount() == null : this.getValidCount().equals(other.getValidCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAffId() == null) ? 0 : getAffId().hashCode());
        result = prime * result + ((getInviterUserId() == null) ? 0 : getInviterUserId().hashCode());
        result = prime * result + ((getInviteeUserId() == null) ? 0 : getInviteeUserId().hashCode());
        result = prime * result + ((getInviteStatus() == null) ? 0 : getInviteStatus().hashCode());
        result = prime * result + ((getValidCount() == null) ? 0 : getValidCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}