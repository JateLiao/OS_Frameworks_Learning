package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wechatuser {
    private Long wxuid;

    private String wxid;

    private String wxidAlias;

    private String nickname;

    private String headImgUrl;

    private Date createTime;

    private Date updateTime;

    public Long getWxuid() {
        return wxuid;
    }

    public void setWxuid(Long wxuid) {
        this.wxuid = wxuid;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getWxidAlias() {
        return wxidAlias;
    }

    public void setWxidAlias(String wxidAlias) {
        this.wxidAlias = wxidAlias == null ? null : wxidAlias.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
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
        sb.append(", wxuid=").append(wxuid);
        sb.append(", wxid=").append(wxid);
        sb.append(", wxidAlias=").append(wxidAlias);
        sb.append(", nickname=").append(nickname);
        sb.append(", headImgUrl=").append(headImgUrl);
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
        Wechatuser other = (Wechatuser) that;
        return (this.getWxuid() == null ? other.getWxuid() == null : this.getWxuid().equals(other.getWxuid()))
            && (this.getWxid() == null ? other.getWxid() == null : this.getWxid().equals(other.getWxid()))
            && (this.getWxidAlias() == null ? other.getWxidAlias() == null : this.getWxidAlias().equals(other.getWxidAlias()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getHeadImgUrl() == null ? other.getHeadImgUrl() == null : this.getHeadImgUrl().equals(other.getHeadImgUrl()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWxuid() == null) ? 0 : getWxuid().hashCode());
        result = prime * result + ((getWxid() == null) ? 0 : getWxid().hashCode());
        result = prime * result + ((getWxidAlias() == null) ? 0 : getWxidAlias().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getHeadImgUrl() == null) ? 0 : getHeadImgUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}