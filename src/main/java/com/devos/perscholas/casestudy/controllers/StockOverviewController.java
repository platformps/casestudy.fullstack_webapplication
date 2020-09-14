package com.devos.perscholas.casestudy.controllers;

import com.devos.perscholas.casestudy.models.StockOverview;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stocks")
public class StockOverviewController {
    @GetMapping("/OVERVIEW/{symbol}")
    public StockOverview getCompanyOverview(@PathVariable("symbol") String symbol) {
        StockOverview stock = new RestTemplate().getForObject(constructApiRequest(symbol), StockOverview.class);
        return stock;
    }

    private String constructApiRequest(String symbol) {
        String apiRequest = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + symbol + "&apikey=7IEE375T5KRNN35W";
        return apiRequest;
    }
}
