package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Item;
import io.fulchr3356.upkeepassistant.models.Sale;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.repositories.ItemRepository;
import io.fulchr3356.upkeepassistant.repositories.SaleRepository;
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
import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SaleController  {
    private final SaleRepository saleRepository;
    private final UserRepository userRepository;
    private final ItemRepository itemRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public SaleController(SaleRepository saleRepository, UserRepository userRepository, ItemRepository itemRepository) {
        this.saleRepository = saleRepository;
        this.userRepository = userRepository;
        this.itemRepository = itemRepository;
    }
    @GetMapping(value = "/sale")
    public Collection<Sale> findAll(Principal principal) {
        return saleRepository.findAllByUserUsername(principal.getName());
    }

    @PostMapping(value = "/sale")
    public ResponseEntity<?> add(@Valid @RequestBody Sale sale,Principal principal) throws URISyntaxException {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + principal.getName()));
        sale.setUser(user);
        this.saleRepository.save(sale);
        Item tempItem = sale.getItem();
        tempItem.setQuantity(tempItem.getQuantity() - sale.getQuantity());
        sale.setItem(tempItem);
        itemRepository.save(tempItem);
        sale.setAmount(sale.getItem().getPrice() * sale.getItem().getQuantity());
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
        saleRepository.save(sale);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/sale/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete sale: {}", id);
        saleRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
