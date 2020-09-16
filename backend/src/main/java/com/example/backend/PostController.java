package com.example.backend;
import java.util.*;

import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class PostController {

    @Autowired
    private PostService service;

    // RESTful API methods for Retrieval operations
    @GetMapping("/posts")
    public List<Post> list() {
        return service.listAll();
    }


    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> get(@PathVariable Integer id) {
        try {
            Post post = service.get(id);
            return new ResponseEntity<Post>(post, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Create operation
    @PostMapping("/posts")
    public ResponseEntity<?> add(@RequestBody Post post) {
        try {
            service.save(post);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NotReadablePropertyException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    // RESTful API method for Update operation
    @PutMapping("/posts/{id}")
    public ResponseEntity<?> update(@RequestBody Post post, @PathVariable Integer id) {
        try {
            Post existPost = service.get(id);
            service.save(post);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/posts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
