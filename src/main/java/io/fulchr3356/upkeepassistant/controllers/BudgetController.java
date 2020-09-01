package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Budget;
import io.fulchr3356.upkeepassistant.repositories.BudgetRepository;
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
public class BudgetController  {
    private final BudgetRepository budgetRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }
    @GetMapping(value = "/budget")
    public Collection<Budget> findAll() {
        return budgetRepository.findAll();
    }

    @PostMapping(value = "/budget")
    public ResponseEntity<?> add(@Valid @RequestBody Budget budget) throws URISyntaxException {
        Budget result = this.budgetRepository.save(budget);
        return ResponseEntity.created(new URI("/api/budget/" + budget.getId()))
                .body(result); }

    @GetMapping(value = "/budget/{id}")
    ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Budget>  budget = budgetRepository.findById(id);
        return budget.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping(value = "/budget/{id}")
    ResponseEntity<?> update(@Valid @RequestBody Budget budget)  {
        log.info("Request to update budget: {}", budget);
        Budget result = budgetRepository.save(budget);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/budget/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete budget: {}", id);
        budgetRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
