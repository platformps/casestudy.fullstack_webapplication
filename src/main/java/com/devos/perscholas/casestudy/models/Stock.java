package com.devos.perscholas.casestudy.models;

import java.util.Date;

public class Stock {
    private String symbol;
    private String assetType;
    private String name;
    private String description;
    private String exchange;
    private String currency;
    private String country;
    private String sector;
    private String industry;
    private String address;
    private Integer fullTimeEmployees;
    private String fiscalYearEnd;
    private Integer marketCapitalization;
    private Double peRatio;
    private Double pegRatio;
    private Double dividendPerShare;
    private Double dividendYield;
    private Double eps;
    private Double profitMargin;
    private Double operatingMarginTTM;
    private Double returnOnAssetsTTM;
    private Double returnOnEquityTTM;
    private Integer revenueTTM;
    private Integer grossProfitTTM;
    private Double quaterlyEarningsGrowthYOY;
    private Double quaterlyRevenueGrowthYOY;
    private Double analystTargetPrice;
    private Double trailingPE;
    private Double forwardPE;
    private Double _52WeekHigh;
    private Double _52WeekLow;
    private Double _50DayMovingAverage;
    private Double _200DayMovingAverage;
    private Double forwardAnnualDividendRate;
    private Double forwardAnnualDividendYield;
    private Double payoutRatio;
    private Date dividendDate;

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", assetType='" + assetType + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", exchange='" + exchange + '\'' +
                ", currency='" + currency + '\'' +
                ", country='" + country + '\'' +
                ", sector='" + sector + '\'' +
                ", industry='" + industry + '\'' +
                ", address='" + address + '\'' +
                ", fullTimeEmployees=" + fullTimeEmployees +
                ", fiscalYearEnd='" + fiscalYearEnd + '\'' +
                ", marketCapitalization=" + marketCapitalization +
                ", peRatio=" + peRatio +
                ", pegRatio=" + pegRatio +
                ", dividendPerShare=" + dividendPerShare +
                ", dividendYield=" + dividendYield +
                ", eps=" + eps +
                ", profitMargin=" + profitMargin +
                ", operatingMarginTTM=" + operatingMarginTTM +
                ", returnOnAssetsTTM=" + returnOnAssetsTTM +
                ", returnOnEquityTTM=" + returnOnEquityTTM +
                ", revenueTTM=" + revenueTTM +
                ", grossProfitTTM=" + grossProfitTTM +
                ", quaterlyEarningsGrowthYOY=" + quaterlyEarningsGrowthYOY +
                ", quaterlyRevenueGrowthYOY=" + quaterlyRevenueGrowthYOY +
                ", analystTargetPrice=" + analystTargetPrice +
                ", trailingPE=" + trailingPE +
                ", forwardPE=" + forwardPE +
                ", _52WeekHigh=" + _52WeekHigh +
                ", _52WeekLow=" + _52WeekLow +
                ", _50DayMovingAverage=" + _50DayMovingAverage +
                ", _200DayMovingAverage=" + _200DayMovingAverage +
                ", forwardAnnualDividendRate=" + forwardAnnualDividendRate +
                ", forwardAnnualDividendYield=" + forwardAnnualDividendYield +
                ", payoutRatio=" + payoutRatio +
                ", dividendDate=" + dividendDate +
                ", exDividendDate=" + exDividendDate +
                '}';
    }

    private Date exDividendDate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(Integer fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    public Integer getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(Integer marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public Double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Double peRatio) {
        this.peRatio = peRatio;
    }

    public Double getPegRatio() {
        return pegRatio;
    }

    public void setPegRatio(Double pegRatio) {
        this.pegRatio = pegRatio;
    }

    public Double getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(Double dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    public Double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(Double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public Double getEps() {
        return eps;
    }

    public void setEps(Double eps) {
        this.eps = eps;
    }

    public Double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(Double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public Double getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    public void setOperatingMarginTTM(Double operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    public Double getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    public void setReturnOnAssetsTTM(Double returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    public Double getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    public void setReturnOnEquityTTM(Double returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    public Integer getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(Integer revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public Integer getGrossProfitTTM() {
        return grossProfitTTM;
    }

    public void setGrossProfitTTM(Integer grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    public Double getQuaterlyEarningsGrowthYOY() {
        return quaterlyEarningsGrowthYOY;
    }

    public void setQuaterlyEarningsGrowthYOY(Double quaterlyEarningsGrowthYOY) {
        this.quaterlyEarningsGrowthYOY = quaterlyEarningsGrowthYOY;
    }

    public Double getQuaterlyRevenueGrowthYOY() {
        return quaterlyRevenueGrowthYOY;
    }

    public void setQuaterlyRevenueGrowthYOY(Double quaterlyRevenueGrowthYOY) {
        this.quaterlyRevenueGrowthYOY = quaterlyRevenueGrowthYOY;
    }

    public Double getAnalystTargetPrice() {
        return analystTargetPrice;
    }

    public void setAnalystTargetPrice(Double analystTargetPrice) {
        this.analystTargetPrice = analystTargetPrice;
    }

    public Double getTrailingPE() {
        return trailingPE;
    }

    public void setTrailingPE(Double trailingPE) {
        this.trailingPE = trailingPE;
    }

    public Double getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(Double forwardPE) {
        this.forwardPE = forwardPE;
    }

    public Double get_52WeekHigh() {
        return _52WeekHigh;
    }

    public void set_52WeekHigh(Double _52WeekHigh) {
        this._52WeekHigh = _52WeekHigh;
    }

    public Double get_52WeekLow() {
        return _52WeekLow;
    }

    public void set_52WeekLow(Double _52WeekLow) {
        this._52WeekLow = _52WeekLow;
    }

    public Double get_50DayMovingAverage() {
        return _50DayMovingAverage;
    }

    public void set_50DayMovingAverage(Double _50DayMovingAverage) {
        this._50DayMovingAverage = _50DayMovingAverage;
    }

    public Double get_200DayMovingAverage() {
        return _200DayMovingAverage;
    }

    public void set_200DayMovingAverage(Double _200DayMovingAverage) {
        this._200DayMovingAverage = _200DayMovingAverage;
    }

    public Double getForwardAnnualDividendRate() {
        return forwardAnnualDividendRate;
    }

    public void setForwardAnnualDividendRate(Double forwardAnnualDividendRate) {
        this.forwardAnnualDividendRate = forwardAnnualDividendRate;
    }

    public Double getForwardAnnualDividendYield() {
        return forwardAnnualDividendYield;
    }

    public void setForwardAnnualDividendYield(Double forwardAnnualDividendYield) {
        this.forwardAnnualDividendYield = forwardAnnualDividendYield;
    }

    public Double getPayoutRatio() {
        return payoutRatio;
    }

    public void setPayoutRatio(Double payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    public Date getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(Date dividendDate) {
        this.dividendDate = dividendDate;
    }

    public Date getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(Date exDividendDate) {
        this.exDividendDate = exDividendDate;
    }
}
