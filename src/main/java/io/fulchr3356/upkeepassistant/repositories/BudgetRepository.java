package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Budget;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface BudgetRepository extends CrudRepository<Budget,Integer> {
    Optional<Budget> findById(Integer id);

}