package com.devos.perscholas.casestudy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyNews {
    //Finnhub
    @JsonProperty("category")
    private String category;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("headline")
    private String headline;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("image")
    private String image;
    @JsonProperty("related")
    private String related;
    @JsonProperty("source")
    private String source;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("url")
    private String url;

    public CompanyNews() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
