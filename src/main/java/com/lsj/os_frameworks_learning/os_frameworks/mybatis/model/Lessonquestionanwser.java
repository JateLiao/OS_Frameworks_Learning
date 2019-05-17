package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Lessonquestionanwser {
    private Integer seqId;

    private String lessonKey;

    private Integer stepId;

    private Integer pageId;

    private Byte answerType;

    private String answer;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getLessonKey() {
        return lessonKey;
    }

    public void setLessonKey(String lessonKey) {
        this.lessonKey = lessonKey == null ? null : lessonKey.trim();
    }

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Byte getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Byte answerType) {
        this.answerType = answerType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqId=").append(seqId);
        sb.append(", lessonKey=").append(lessonKey);
        sb.append(", stepId=").append(stepId);
        sb.append(", pageId=").append(pageId);
        sb.append(", answerType=").append(answerType);
        sb.append(", answer=").append(answer);
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
        Lessonquestionanwser other = (Lessonquestionanwser) that;
        return (this.getSeqId() == null ? other.getSeqId() == null : this.getSeqId().equals(other.getSeqId()))
            && (this.getLessonKey() == null ? other.getLessonKey() == null : this.getLessonKey().equals(other.getLessonKey()))
            && (this.getStepId() == null ? other.getStepId() == null : this.getStepId().equals(other.getStepId()))
            && (this.getPageId() == null ? other.getPageId() == null : this.getPageId().equals(other.getPageId()))
            && (this.getAnswerType() == null ? other.getAnswerType() == null : this.getAnswerType().equals(other.getAnswerType()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeqId() == null) ? 0 : getSeqId().hashCode());
        result = prime * result + ((getLessonKey() == null) ? 0 : getLessonKey().hashCode());
        result = prime * result + ((getStepId() == null) ? 0 : getStepId().hashCode());
        result = prime * result + ((getPageId() == null) ? 0 : getPageId().hashCode());
        result = prime * result + ((getAnswerType() == null) ? 0 : getAnswerType().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return result;
    }
}