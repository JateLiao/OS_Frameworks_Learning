package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Businessuser {
    private Long buid;

    private Byte projectId;

    private Long projectUid;

    private String nickname;

    private String headImgUrl;

    private Date createTime;

    private Date updateTime;

    public Long getBuid() {
        return buid;
    }

    public void setBuid(Long buid) {
        this.buid = buid;
    }

    public Byte getProjectId() {
        return projectId;
    }

    public void setProjectId(Byte projectId) {
        this.projectId = projectId;
    }

    public Long getProjectUid() {
        return projectUid;
    }

    public void setProjectUid(Long projectUid) {
        this.projectUid = projectUid;
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
        sb.append(", buid=").append(buid);
        sb.append(", projectId=").append(projectId);
        sb.append(", projectUid=").append(projectUid);
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
        Businessuser other = (Businessuser) that;
        return (this.getBuid() == null ? other.getBuid() == null : this.getBuid().equals(other.getBuid()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectUid() == null ? other.getProjectUid() == null : this.getProjectUid().equals(other.getProjectUid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getHeadImgUrl() == null ? other.getHeadImgUrl() == null : this.getHeadImgUrl().equals(other.getHeadImgUrl()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBuid() == null) ? 0 : getBuid().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectUid() == null) ? 0 : getProjectUid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getHeadImgUrl() == null) ? 0 : getHeadImgUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}