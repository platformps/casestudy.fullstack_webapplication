package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.models.User;
import io.fulchr3356.upkeepassistant.models.UserBuilder;
import io.fulchr3356.upkeepassistant.repositories.DepartmentRepository;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
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
public class EmployeeController  {
    private final EmployeeRepository employeeRepository;
    private UserRepository userRepository;
    private DepartmentRepository departmentRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeRepository employeeRepository, UserRepository userRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.userRepository = userRepository;
        this.departmentRepository = departmentRepository;
    }
    @GetMapping(value = "/employee")
    public Collection<Employee> findAll(Principal principal) {
        return employeeRepository.findAllByUserId(principal.getName());
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Employee> add(@Valid @RequestBody Employee employee, @AuthenticationPrincipal OAuth2User principal) throws URISyntaxException {

       Map<String,Object> details = principal.getAttributes();
       String userId = details.get("sub").toString();
        // check to see if user already exists
        Optional<User> user = userRepository.findById(userId);
        employee.setUser(user.orElse(new UserBuilder().withId(userId)
                                                      .withName(details.get("name").toString())
                                                      .withEmail(details.get("email").toString()).build()));
        Employee result = employeeRepository.save(employee);
        departmentRepository.save(employee.getDepartment());
       return ResponseEntity.created(new URI("/api/employee/" + employee.getId()))
               .body(result); }

    @GetMapping(value = "/employee/{id}")
     public ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Employee>  employee = employeeRepository.findById(id);
        return employee.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> update(@Valid @RequestBody Employee employee, @PathVariable Integer id)  {
        log.info("Request to update employee: {}", employee);
        Employee result = employeeRepository.save(employee);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/employee/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete employee: {}", id);
        employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
