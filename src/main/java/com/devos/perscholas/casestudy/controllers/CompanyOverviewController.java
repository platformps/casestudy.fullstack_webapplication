package com.devos.perscholas.casestudy.controllers;

import com.devos.perscholas.casestudy.models.StockOverview;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/company-overview")
public class CompanyOverviewController {
    @GetMapping("/{symbol}")
    public StockOverview getCompanyOverview(@PathVariable("symbol") String symbol) {
        StockOverview stock = new RestTemplate().getForObject(constructApiRequest(symbol), StockOverview.class);
        return stock;
    }

    private String constructApiRequest(String symbol) {
        String apiRequest = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + symbol + "&apikey=7IEE375T5KRNN35W";
        return apiRequest;
    }

    @GetMapping
    public String getView(Model model, @PathVariable("symbol") String symbol) {

        return "company-overview";
    }
}
