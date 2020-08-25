package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Sale;
import io.fulchr3356.upkeepassistant.repositories.SaleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SaleController  {
    private final SaleRepository saleRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public SaleController(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
    @GetMapping(value = "/sale")
    public Collection<Sale> findAll() {
        return saleRepository.findAll();
    }


    ResponseEntity<?> add(@Valid @RequestBody Sale sale) throws URISyntaxException {
        Sale result = this.saleRepository.save(sale);
        return ResponseEntity.created(new URI("/api/sale/" + sale.getId()))
                .body(result); }

    @GetMapping(value = "/sale/{id}")
    ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Sale>  sale = saleRepository.findById(id);
        return sale.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping(value = "/sale/{id}")
    ResponseEntity<?> update(@Valid @RequestBody Sale sale)  {
        log.info("Request to update sale: {}", sale);
        Sale result = saleRepository.save(sale);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/sale/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete sale: {}", id);
        saleRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
