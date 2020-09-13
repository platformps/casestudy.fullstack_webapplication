package com.devos.perscholas.casestudy.controllers;

import com.devos.perscholas.casestudy.models.Stock;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stocks")
public class AlphaVantageController {
    private String constructApiCall(String function, String symbol) {
        String apiCall = "https://www.alphavantage.co/query?function="
                + function + "&symbol=" + symbol + "&apikey=7IEE375T5KRNN35W";
        return apiCall;
    }


    @RequestMapping("/{function}/{symbol}")
    public Stock getCompanyOverview(@PathVariable("function") String function, @PathVariable("symbol") String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        Stock stock = restTemplate.getForObject(constructApiCall(function, symbol), Stock.class);
        return stock;
    }
}
