package com.jianshu.model;

import javax.persistence.*;

public class Collections {
    @Id
    @Column(name = "collection_id")
    private Integer collectionId;

    @Column(name = "collection_count")
    private Integer collectionCount;

    @Column(name = "collection_name")
    private String collectionName;

    @Column(name = "collection_url")
    private String collectionUrl;

    @Column(name = "fans_count")
    private Integer fansCount;

    private String summary;

    /**
     * @return collection_id
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * @param collectionId
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * @return collection_count
     */
    public Integer getCollectionCount() {
        return collectionCount;
    }

    /**
     * @param collectionCount
     */
    public void setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
    }

    /**
     * @return collection_name
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * @param collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * @return collection_url
     */
    public String getCollectionUrl() {
        return collectionUrl;
    }

    /**
     * @param collectionUrl
     */
    public void setCollectionUrl(String collectionUrl) {
        this.collectionUrl = collectionUrl;
    }

    /**
     * @return fans_count
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * @param fansCount
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}