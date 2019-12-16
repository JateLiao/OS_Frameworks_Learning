package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wechatmessage {
    private Long messageId;

    private Long sourceWxuid;

    private Byte type;

    private Long wxgid;

    private Long wxuidFrom;

    private Long wxuidTo;

    private String msg;

    private String fileIndex;

    private String resourceUrl;

    private Date createTime;

    private Date updateTime;

    private String rawMsg;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getSourceWxuid() {
        return sourceWxuid;
    }

    public void setSourceWxuid(Long sourceWxuid) {
        this.sourceWxuid = sourceWxuid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getWxgid() {
        return wxgid;
    }

    public void setWxgid(Long wxgid) {
        this.wxgid = wxgid;
    }

    public Long getWxuidFrom() {
        return wxuidFrom;
    }

    public void setWxuidFrom(Long wxuidFrom) {
        this.wxuidFrom = wxuidFrom;
    }

    public Long getWxuidTo() {
        return wxuidTo;
    }

    public void setWxuidTo(Long wxuidTo) {
        this.wxuidTo = wxuidTo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getFileIndex() {
        return fileIndex;
    }

    public void setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex == null ? null : fileIndex.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
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

    public String getRawMsg() {
        return rawMsg;
    }

    public void setRawMsg(String rawMsg) {
        this.rawMsg = rawMsg == null ? null : rawMsg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageId=").append(messageId);
        sb.append(", sourceWxuid=").append(sourceWxuid);
        sb.append(", type=").append(type);
        sb.append(", wxgid=").append(wxgid);
        sb.append(", wxuidFrom=").append(wxuidFrom);
        sb.append(", wxuidTo=").append(wxuidTo);
        sb.append(", msg=").append(msg);
        sb.append(", fileIndex=").append(fileIndex);
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", rawMsg=").append(rawMsg);
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
        Wechatmessage other = (Wechatmessage) that;
        return (this.getMessageId() == null ? other.getMessageId() == null : this.getMessageId().equals(other.getMessageId()))
            && (this.getSourceWxuid() == null ? other.getSourceWxuid() == null : this.getSourceWxuid().equals(other.getSourceWxuid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getWxgid() == null ? other.getWxgid() == null : this.getWxgid().equals(other.getWxgid()))
            && (this.getWxuidFrom() == null ? other.getWxuidFrom() == null : this.getWxuidFrom().equals(other.getWxuidFrom()))
            && (this.getWxuidTo() == null ? other.getWxuidTo() == null : this.getWxuidTo().equals(other.getWxuidTo()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getFileIndex() == null ? other.getFileIndex() == null : this.getFileIndex().equals(other.getFileIndex()))
            && (this.getResourceUrl() == null ? other.getResourceUrl() == null : this.getResourceUrl().equals(other.getResourceUrl()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRawMsg() == null ? other.getRawMsg() == null : this.getRawMsg().equals(other.getRawMsg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        result = prime * result + ((getSourceWxuid() == null) ? 0 : getSourceWxuid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getWxgid() == null) ? 0 : getWxgid().hashCode());
        result = prime * result + ((getWxuidFrom() == null) ? 0 : getWxuidFrom().hashCode());
        result = prime * result + ((getWxuidTo() == null) ? 0 : getWxuidTo().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getFileIndex() == null) ? 0 : getFileIndex().hashCode());
        result = prime * result + ((getResourceUrl() == null) ? 0 : getResourceUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRawMsg() == null) ? 0 : getRawMsg().hashCode());
        return result;
    }
}