package cn.tinman.sharedservices.wms.provider.model.po;

import java.util.Date;

public class Wehubexchangemessage {
    private Long id;

    private Long wxuid;

    private Byte exchangeType;

    private Byte exchangeStep;

    private Date createTime;

    private Date updateTime;

    private String body;

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

    public Byte getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(Byte exchangeType) {
        this.exchangeType = exchangeType;
    }

    public Byte getExchangeStep() {
        return exchangeStep;
    }

    public void setExchangeStep(Byte exchangeStep) {
        this.exchangeStep = exchangeStep;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wxuid=").append(wxuid);
        sb.append(", exchangeType=").append(exchangeType);
        sb.append(", exchangeStep=").append(exchangeStep);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", body=").append(body);
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
        Wehubexchangemessage other = (Wehubexchangemessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWxuid() == null ? other.getWxuid() == null : this.getWxuid().equals(other.getWxuid()))
            && (this.getExchangeType() == null ? other.getExchangeType() == null : this.getExchangeType().equals(other.getExchangeType()))
            && (this.getExchangeStep() == null ? other.getExchangeStep() == null : this.getExchangeStep().equals(other.getExchangeStep()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWxuid() == null) ? 0 : getWxuid().hashCode());
        result = prime * result + ((getExchangeType() == null) ? 0 : getExchangeType().hashCode());
        result = prime * result + ((getExchangeStep() == null) ? 0 : getExchangeStep().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        return result;
    }
}