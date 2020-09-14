package com.devos.perscholas.casestudy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyLogo {
    //IEX Cloud
    @JsonProperty("url")
    private String logoUrl;

    public CompanyLogo() {
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
