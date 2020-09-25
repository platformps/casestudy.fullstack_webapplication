package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PayrollRepository extends JpaRepository<Payroll,Integer> {
    List<Payroll> findAllByUserUsername(String name);
}
