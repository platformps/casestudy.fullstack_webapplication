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
}
