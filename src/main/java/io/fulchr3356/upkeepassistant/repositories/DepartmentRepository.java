package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Department;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
    Optional<Department> findById(Integer id);

}