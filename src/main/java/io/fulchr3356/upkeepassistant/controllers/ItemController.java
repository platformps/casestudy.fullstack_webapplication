package io.fulchr3356.upkeepassistant.controllers;


import io.fulchr3356.upkeepassistant.models.Item;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.models.UserBuilder;
import io.fulchr3356.upkeepassistant.repositories.ItemRepository;
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
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ItemController  {
    private final ItemRepository itemRepository;
    private UserRepository userRepository;
    private final Logger log = LoggerFactory.getLogger(ItemController.class);

    public ItemController(ItemRepository itemRepository, UserRepository userRepository) {
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
    }
    @GetMapping(value = "/item")
    public Collection<Item> findAll(Principal principal) {
        return itemRepository.findAllByUserId(principal.getName());
    }

    @PostMapping(value = "/item")
    public ResponseEntity<Item> add(@Valid @RequestBody Item item, @AuthenticationPrincipal OAuth2User principal) throws URISyntaxException {

        Map<String,Object> details = principal.getAttributes();
        String userId = details.get("sub").toString();
        // check to see if user already exists
        Optional<User> user = userRepository.findById(userId);
        item.setUser(user.orElse(new UserBuilder().withId(userId)
                .withName(details.get("name").toString())
                .withEmail(details.get("email").toString()).build()));
        Item result = itemRepository.save(item);
        return ResponseEntity.created(new URI("/api/item/" + item.getId()))
                .body(result); }

    @GetMapping(value = "/item/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Item>  item = itemRepository.findById(id);
        return item.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/item/{id}")
    public ResponseEntity<Item> update(@Valid @RequestBody Item item, @PathVariable Integer id)  {
        log.info("Request to update item: {}", item);
        Item result = itemRepository.save(item);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/item/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete item: {}", id);
        itemRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
