package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByUserUsername(String username);

}
