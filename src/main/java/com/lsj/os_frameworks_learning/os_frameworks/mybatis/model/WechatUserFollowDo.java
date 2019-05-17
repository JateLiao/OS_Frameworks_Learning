package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class WechatUserFollowDo {
    private Integer seqId;

    private String wechatAppId;

    private String wechatOpenid;

    private Byte followStatus;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId == null ? null : wechatAppId.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public Byte getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Byte followStatus) {
        this.followStatus = followStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqId=").append(seqId);
        sb.append(", wechatAppId=").append(wechatAppId);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", followStatus=").append(followStatus);
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
        WechatUserFollowDo other = (WechatUserFollowDo) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getWechatAppId() == null ? other.getWechatAppId() == null : this.getWechatAppId().equals(other.getWechatAppId()))
            && (this.getWechatOpenid() == null ? other.getWechatOpenid() == null : this.getWechatOpenid().equals(other.getWechatOpenid()))
            && (this.getFollowStatus() == null ? other.getFollowStatus() == null : this.getFollowStatus().equals(other.getFollowStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getWechatAppId() == null) ? 0 : getWechatAppId().hashCode());
        result = prime * result + ((getWechatOpenid() == null) ? 0 : getWechatOpenid().hashCode());
        result = prime * result + ((getFollowStatus() == null) ? 0 : getFollowStatus().hashCode());
        return result;
    }
}