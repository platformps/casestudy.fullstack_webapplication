package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Department;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.repositories.DepartmentRepository;
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
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DepartmentController  {
    private final DepartmentRepository departmentRepository;
    private final UserRepository userRepository;
    private final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    public DepartmentController(DepartmentRepository departmentRepository, UserRepository userRepository) {
        this.departmentRepository = departmentRepository;
        this.userRepository = userRepository;
    }
    @GetMapping(value = "/department")
    public Collection<Department> findAll(Principal principal) {
        return departmentRepository.findAllByUserUsername(principal.getName());
    }

    @PostMapping(value = "/department")
    public ResponseEntity<?> add(@Valid @RequestBody Department department, Principal principal) throws URISyntaxException {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + principal.getName()));
        department.setUser(user);
        Department result = this.departmentRepository.save(department);
        return ResponseEntity.created(new URI("/api/department/" + department.getId()))
                .body(result); }

    @GetMapping(value = "/department/{id}")
    ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Department>  department = departmentRepository.findById(id);
        return department.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping(value = "/department/{id}")
    ResponseEntity<?> update(@Valid @RequestBody Department department)  {
        log.info("Request to update department: {}", department);
        Department result = departmentRepository.save(department);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/department/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete department: {}", id);
        departmentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
