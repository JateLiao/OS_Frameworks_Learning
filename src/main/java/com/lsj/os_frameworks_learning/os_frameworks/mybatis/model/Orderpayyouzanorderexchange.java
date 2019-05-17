package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

import java.util.Date;

public class Orderpayyouzanorderexchange {
    private Integer id;

    private String orderNo;

    private String youzanOrderTid;

    private Date createTime;

    private Date updateTime;

    private String youzanOrderDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getYouzanOrderTid() {
        return youzanOrderTid;
    }

    public void setYouzanOrderTid(String youzanOrderTid) {
        this.youzanOrderTid = youzanOrderTid == null ? null : youzanOrderTid.trim();
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

    public String getYouzanOrderDetail() {
        return youzanOrderDetail;
    }

    public void setYouzanOrderDetail(String youzanOrderDetail) {
        this.youzanOrderDetail = youzanOrderDetail == null ? null : youzanOrderDetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", youzanOrderTid=").append(youzanOrderTid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", youzanOrderDetail=").append(youzanOrderDetail);
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
        Orderpayyouzanorderexchange other = (Orderpayyouzanorderexchange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getYouzanOrderTid() == null ? other.getYouzanOrderTid() == null : this.getYouzanOrderTid().equals(other.getYouzanOrderTid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getYouzanOrderDetail() == null ? other.getYouzanOrderDetail() == null : this.getYouzanOrderDetail().equals(other.getYouzanOrderDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getYouzanOrderTid() == null) ? 0 : getYouzanOrderTid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getYouzanOrderDetail() == null) ? 0 : getYouzanOrderDetail().hashCode());
        return result;
    }
}