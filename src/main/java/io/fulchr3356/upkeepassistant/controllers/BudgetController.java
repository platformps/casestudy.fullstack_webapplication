package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Budget;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.models.UserBuilder;
import io.fulchr3356.upkeepassistant.repositories.BudgetRepository;
import io.fulchr3356.upkeepassistant.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BudgetController  {
    private final BudgetRepository budgetRepository;
    private final UserRepository userRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public BudgetController(BudgetRepository budgetRepository, UserRepository userRepository) {
        this.budgetRepository = budgetRepository;
        this.userRepository = userRepository;
    }
    @GetMapping(value = "/budget")
    public Collection<Budget> findAll(Principal principal) {
        return budgetRepository.findAllByUserId(principal.getName());
    }

    @PostMapping(value = "/budget")
    public ResponseEntity<?> add(@Valid @RequestBody Budget budget,@AuthenticationPrincipal OAuth2User principal) throws URISyntaxException {
        Map<String,Object> details = principal.getAttributes();
        String userId = details.get("sub").toString();
        // check to see if user already exists
        Optional<User> user = userRepository.findById(userId);
        budget.setUser(user.orElse(new UserBuilder().withId(userId)
                .withName(details.get("name").toString())
                .withEmail(details.get("email").toString()).build()));
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
