package com.devos.perscholas.casestudy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockOverview {
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("AssetType")
    private String assetType;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Exchange")
    private String exchange;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Sector")
    private String sector;
    @JsonProperty("Industry")
    private String industry;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("FullTimeEmployees")
    private Integer fullTimeEmployees;
    @JsonProperty("FiscalYearEnd")
    private String fiscalYearEnd;
    @JsonProperty("MarketCapitalization")
    private Long marketCapitalization;
    @JsonProperty("EBITDA")
    private Long EBITDA;
    @JsonProperty("PERatio")
    private Double peRatio;
    @JsonProperty("PEGRatio")
    private Double pegRatio;
    @JsonProperty("BookValue")
    private Double bookValue;
    @JsonProperty("DividendPerShare")
    private String dividendPerShare;
    @JsonProperty("DividendYield")
    private Double dividendYield;
    @JsonProperty("EPS")
    private Double eps;
    @JsonProperty("RevenuePerShareTTM")
    private Double revenuePerShareTTM;
    @JsonProperty("ProfitMargin")
    private Double profitMargin;
    @JsonProperty("OperatingMarginTTM")
    private Double operatingMarginTTM;
    @JsonProperty("ReturnOnAssetsTTM")
    private Double returnOnAssetsTTM;
    @JsonProperty("ReturnOnEquityTTM")
    private Double returnOnEquityTTM;
    @JsonProperty("RevenueTTM")
    private Long revenueTTM;
    @JsonProperty("GrossProfitTTM")
    private Long grossProfitTTM;
    @JsonProperty("DilutedEPSTTM")
    private Double dilutedEPSTTM;
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    private Double quarterlyEarningsGrowthYOY;
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    private Double quarterlyRevenueGrowthYOY;
    @JsonProperty("AnalystTargetPrice")
    private Double analystTargetPrice;
    @JsonProperty("TrailingPE")
    private Double trailingPE;
    @JsonProperty("ForwardPE")
    private Double forwardPE;
    @JsonProperty("PriceToSalesRatioTTM")
    private Double priceToSalesRatioTTM;
    @JsonProperty("PriceToBookRatio")
    private Double priceToBookRatio;
    @JsonProperty("EVToRevenue")
    private Double EVToRevenue;
    @JsonProperty("EVToEBITDA")
    private Double EVToEBITDA;
    @JsonProperty("Beta")
    private Double beta;
    @JsonProperty("52WeekHigh")
    private Double fiftyTwoWeekHigh;
    @JsonProperty("52WeekLow")
    private Double fiftyTwoWeekLow;
    @JsonProperty("50DayMovingAverage")
    private Double fiftyDayMovingAverage;
    @JsonProperty("200DayMovingAverage")
    private Double twoHundredDayMovingAverage;
    @JsonProperty("SharesOutstanding")
    private Long sharesOutstanding;
    @JsonProperty("SharesFloat")
    private Long sharesFloat;
    @JsonProperty("SharesShort")
    private Long sharesShort;
    @JsonProperty("SharesShortPriorMonth")
    private Long sharesShortPriorMonth;
    @JsonProperty("ShortRatio")
    private Double shortRatio;
    @JsonProperty("ShortPercentOutstanding")
    private Double shortPercentOutstanding;
    @JsonProperty("ShortPercentFloat")
    private Double shortPercentFloat;
    @JsonProperty("PercentInsiders")
    private Double percentInsiders;
    @JsonProperty("PercentInstitutions")
    private Double percentInstitutions;
    @JsonProperty("ForwardAnnualDividendRate")
    private Double forwardAnnualDividendRate;
    @JsonProperty("ForwardAnnualDividendYield")
    private Double forwardAnnualDividendYield;
    @JsonProperty("PayoutRatio")
    private Double payoutRatio;
    @JsonProperty("DividendDate")
    private String dividendDate;
    @JsonProperty("ExDividendDate")
    private String exDividendDate;
    @JsonProperty("LastSplitFactor")
    private String lastSplitFactor;
    @JsonProperty("LastSplitDate")
    private String lastSplitDate;

    public StockOverview() {
    }

    public Double getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    public void setQuarterlyEarningsGrowthYOY(Double quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    public Double getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    public void setQuarterlyRevenueGrowthYOY(Double quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

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

    public Long getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(Long marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public Long getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(Long EBITDA) {
        this.EBITDA = EBITDA;
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

    public Double getBookValue() {
        return bookValue;
    }

    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    public String getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(String dividendPerShare) {
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

    public Double getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    public void setRevenuePerShareTTM(Double revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
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

    public Long getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(Long revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public Long getGrossProfitTTM() {
        return grossProfitTTM;
    }

    public void setGrossProfitTTM(Long grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    public Double getDilutedEPSTTM() {
        return dilutedEPSTTM;
    }

    public void setDilutedEPSTTM(Double dilutedEPSTTM) {
        this.dilutedEPSTTM = dilutedEPSTTM;
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

    public Double getPriceToSalesRatioTTM() {
        return priceToSalesRatioTTM;
    }

    public void setPriceToSalesRatioTTM(Double priceToSalesRatioTTM) {
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
    }

    public Double getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(Double priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public Double getEVToRevenue() {
        return EVToRevenue;
    }

    public void setEVToRevenue(Double EVToRevenue) {
        this.EVToRevenue = EVToRevenue;
    }

    public Double getEVToEBITDA() {
        return EVToEBITDA;
    }

    public void setEVToEBITDA(Double EVToEBITDA) {
        this.EVToEBITDA = EVToEBITDA;
    }

    public Double getBeta() {
        return beta;
    }

    public void setBeta(Double beta) {
        this.beta = beta;
    }

    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public Double getFiftyDayMovingAverage() {
        return fiftyDayMovingAverage;
    }

    public void setFiftyDayMovingAverage(Double fiftyDayMovingAverage) {
        this.fiftyDayMovingAverage = fiftyDayMovingAverage;
    }

    public Double getTwoHundredDayMovingAverage() {
        return twoHundredDayMovingAverage;
    }

    public void setTwoHundredDayMovingAverage(Double twoHundredDayMovingAverage) {
        this.twoHundredDayMovingAverage = twoHundredDayMovingAverage;
    }

    public Long getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(Long sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public Long getSharesFloat() {
        return sharesFloat;
    }

    public void setSharesFloat(Long sharesFloat) {
        this.sharesFloat = sharesFloat;
    }

    public Long getSharesShort() {
        return sharesShort;
    }

    public void setSharesShort(Long sharesShort) {
        this.sharesShort = sharesShort;
    }

    public Long getSharesShortPriorMonth() {
        return sharesShortPriorMonth;
    }

    public void setSharesShortPriorMonth(Long sharesShortPriorMonth) {
        this.sharesShortPriorMonth = sharesShortPriorMonth;
    }

    public Double getShortRatio() {
        return shortRatio;
    }

    public void setShortRatio(Double shortRatio) {
        this.shortRatio = shortRatio;
    }

    public Double getShortPercentOutstanding() {
        return shortPercentOutstanding;
    }

    public void setShortPercentOutstanding(Double shortPercentOutstanding) {
        this.shortPercentOutstanding = shortPercentOutstanding;
    }

    public Double getShortPercentFloat() {
        return shortPercentFloat;
    }

    public void setShortPercentFloat(Double shortPercentFloat) {
        this.shortPercentFloat = shortPercentFloat;
    }

    public Double getPercentInsiders() {
        return percentInsiders;
    }

    public void setPercentInsiders(Double percentInsiders) {
        this.percentInsiders = percentInsiders;
    }

    public Double getPercentInstitutions() {
        return percentInstitutions;
    }

    public void setPercentInstitutions(Double percentInstitutions) {
        this.percentInstitutions = percentInstitutions;
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

    public String getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public String getLastSplitFactor() {
        return lastSplitFactor;
    }

    public void setLastSplitFactor(String lastSplitFactor) {
        this.lastSplitFactor = lastSplitFactor;
    }

    public String getLastSplitDate() {
        return lastSplitDate;
    }

    public void setLastSplitDate(String lastSplitDate) {
        this.lastSplitDate = lastSplitDate;
    }
}
