package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Optional<Employee> findById(Integer id);

}
