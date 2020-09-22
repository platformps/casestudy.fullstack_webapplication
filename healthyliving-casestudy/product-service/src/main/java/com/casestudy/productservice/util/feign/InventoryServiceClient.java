package com.casestudy.productservice.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("inventory-service")
public interface InventoryServiceClient {

    @RequestMapping(method = RequestMethod.DELETE,value = "/inventory/product/{id}")
    public void deleteInventoryByProductId(@PathVariable int id);
}
