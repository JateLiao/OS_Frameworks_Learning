package cn.tinman.sharedservices.wms.provider.model.po;

import java.math.BigDecimal;
import java.util.Date;

public class Similarityimagematch {
    private Long id;

    private Long leftImageId;

    private Long rightImageId;

    private Byte algorithmId;

    private String matchResult;

    private Byte matchType;

    private BigDecimal matchThreshold;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLeftImageId() {
        return leftImageId;
    }

    public void setLeftImageId(Long leftImageId) {
        this.leftImageId = leftImageId;
    }

    public Long getRightImageId() {
        return rightImageId;
    }

    public void setRightImageId(Long rightImageId) {
        this.rightImageId = rightImageId;
    }

    public Byte getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(Byte algorithmId) {
        this.algorithmId = algorithmId;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult == null ? null : matchResult.trim();
    }

    public Byte getMatchType() {
        return matchType;
    }

    public void setMatchType(Byte matchType) {
        this.matchType = matchType;
    }

    public BigDecimal getMatchThreshold() {
        return matchThreshold;
    }

    public void setMatchThreshold(BigDecimal matchThreshold) {
        this.matchThreshold = matchThreshold;
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
        sb.append(", leftImageId=").append(leftImageId);
        sb.append(", rightImageId=").append(rightImageId);
        sb.append(", algorithmId=").append(algorithmId);
        sb.append(", matchResult=").append(matchResult);
        sb.append(", matchType=").append(matchType);
        sb.append(", matchThreshold=").append(matchThreshold);
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
        Similarityimagematch other = (Similarityimagematch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLeftImageId() == null ? other.getLeftImageId() == null : this.getLeftImageId().equals(other.getLeftImageId()))
            && (this.getRightImageId() == null ? other.getRightImageId() == null : this.getRightImageId().equals(other.getRightImageId()))
            && (this.getAlgorithmId() == null ? other.getAlgorithmId() == null : this.getAlgorithmId().equals(other.getAlgorithmId()))
            && (this.getMatchResult() == null ? other.getMatchResult() == null : this.getMatchResult().equals(other.getMatchResult()))
            && (this.getMatchType() == null ? other.getMatchType() == null : this.getMatchType().equals(other.getMatchType()))
            && (this.getMatchThreshold() == null ? other.getMatchThreshold() == null : this.getMatchThreshold().equals(other.getMatchThreshold()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLeftImageId() == null) ? 0 : getLeftImageId().hashCode());
        result = prime * result + ((getRightImageId() == null) ? 0 : getRightImageId().hashCode());
        result = prime * result + ((getAlgorithmId() == null) ? 0 : getAlgorithmId().hashCode());
        result = prime * result + ((getMatchResult() == null) ? 0 : getMatchResult().hashCode());
        result = prime * result + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        result = prime * result + ((getMatchThreshold() == null) ? 0 : getMatchThreshold().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}