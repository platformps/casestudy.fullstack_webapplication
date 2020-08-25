package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Budget;
import io.fulchr3356.upkeepassistant.repositories.BudgetRepository;

import java.util.Optional;

public class BudgetController implements ControllerInterface<Budget>{
    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository){
        this.budgetRepository = budgetRepository;
    }
    @Override
    public Optional<Budget> findById(Integer id) {
        return budgetRepository.findById(id);
    }

    @Override
    public Iterable<Budget> findAll() {
        return budgetRepository.findAll();
    }

    @Override
    public void update(Budget budget) {
        //TODO add build budget
        budgetRepository.save(budget);
    }

    @Override
    public void add(Budget budget) {
        budgetRepository.save(budget);
    }

    @Override
    public void delete(Integer id) {
        budgetRepository.deleteById(id);
    }
}
