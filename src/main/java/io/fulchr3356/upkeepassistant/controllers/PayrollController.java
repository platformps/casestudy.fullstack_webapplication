package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Payroll;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.repositories.PayrollRepository;
import io.fulchr3356.upkeepassistant.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.security.Principal;

@RestController
@RequestMapping("/api")
public class PayrollController  {
    private final PayrollRepository payrollRepository;
    private UserRepository userRepository;
    private final Logger log = LoggerFactory.getLogger(PayrollController.class);

    public PayrollController(PayrollRepository payrollRepository, UserRepository userRepository) {
        this.payrollRepository = payrollRepository;
        this.userRepository = userRepository;
    }
    @GetMapping(value = "/payroll")
    public Collection<Payroll> findAll(Principal principal) {
        return payrollRepository.findAllByUserUsername(principal.getName());
    }

    @PostMapping(value = "/payroll")
    public ResponseEntity<Payroll> add(@Valid @RequestBody Payroll payroll, Principal principal) throws URISyntaxException {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + principal.getName()));
        payroll.setUser(user);
        Payroll result = payrollRepository.save(payroll);
        return ResponseEntity.created(new URI("/api/payroll/" + payroll.getId()))
                .body(result); }

    @GetMapping(value = "/payroll/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Payroll>  payroll = payrollRepository.findById(id);
        return payroll.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/payroll/{id}")
    public ResponseEntity<Payroll> update(@Valid @RequestBody Payroll payroll)  {
        log.info("Request to update payroll: {}", payroll);
        Payroll result = payrollRepository.save(payroll);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/payroll/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete payroll: {}", id);
        payrollRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
