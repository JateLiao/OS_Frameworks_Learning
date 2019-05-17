package com.lsj.os_frameworks_learning.os_frameworks.mybatis.model;

public class Chapter {
    private Integer id;

    private String key;

    private Integer subjectId;

    private String orderName;

    private String name;

    private String coverImage;

    private String entranceImage;

    private String entranceImageLive;

    private Integer wordCount;

    private String shareWithFriend;

    private String pushText;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public String getEntranceImage() {
        return entranceImage;
    }

    public void setEntranceImage(String entranceImage) {
        this.entranceImage = entranceImage == null ? null : entranceImage.trim();
    }

    public String getEntranceImageLive() {
        return entranceImageLive;
    }

    public void setEntranceImageLive(String entranceImageLive) {
        this.entranceImageLive = entranceImageLive == null ? null : entranceImageLive.trim();
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getShareWithFriend() {
        return shareWithFriend;
    }

    public void setShareWithFriend(String shareWithFriend) {
        this.shareWithFriend = shareWithFriend == null ? null : shareWithFriend.trim();
    }

    public String getPushText() {
        return pushText;
    }

    public void setPushText(String pushText) {
        this.pushText = pushText == null ? null : pushText.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", key=").append(key);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", orderName=").append(orderName);
        sb.append(", name=").append(name);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", entranceImage=").append(entranceImage);
        sb.append(", entranceImageLive=").append(entranceImageLive);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", shareWithFriend=").append(shareWithFriend);
        sb.append(", pushText=").append(pushText);
        sb.append(", comment=").append(comment);
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
        Chapter other = (Chapter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCoverImage() == null ? other.getCoverImage() == null : this.getCoverImage().equals(other.getCoverImage()))
            && (this.getEntranceImage() == null ? other.getEntranceImage() == null : this.getEntranceImage().equals(other.getEntranceImage()))
            && (this.getEntranceImageLive() == null ? other.getEntranceImageLive() == null : this.getEntranceImageLive().equals(other.getEntranceImageLive()))
            && (this.getWordCount() == null ? other.getWordCount() == null : this.getWordCount().equals(other.getWordCount()))
            && (this.getShareWithFriend() == null ? other.getShareWithFriend() == null : this.getShareWithFriend().equals(other.getShareWithFriend()))
            && (this.getPushText() == null ? other.getPushText() == null : this.getPushText().equals(other.getPushText()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCoverImage() == null) ? 0 : getCoverImage().hashCode());
        result = prime * result + ((getEntranceImage() == null) ? 0 : getEntranceImage().hashCode());
        result = prime * result + ((getEntranceImageLive() == null) ? 0 : getEntranceImageLive().hashCode());
        result = prime * result + ((getWordCount() == null) ? 0 : getWordCount().hashCode());
        result = prime * result + ((getShareWithFriend() == null) ? 0 : getShareWithFriend().hashCode());
        result = prime * result + ((getPushText() == null) ? 0 : getPushText().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }
}