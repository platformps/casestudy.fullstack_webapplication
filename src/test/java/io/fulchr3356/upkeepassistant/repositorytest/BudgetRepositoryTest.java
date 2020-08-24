package io.fulchr3356.upkeepassistant.repositorytest;

import io.fulchr3356.upkeepassistant.models.Budget;
import io.fulchr3356.upkeepassistant.models.Department;
import io.fulchr3356.upkeepassistant.repositories.BudgetRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BudgetRepositoryTest {
    @Autowired
    private BudgetRepository budgetRepository;
    @Before
    public void setUp() {
        Budget budget1= new Budget("Clothing Budget");
        Budget budget2= new Budget("Tools Budget");
        //save employee, verify has ID value after save
        assertNull(budget1.getId());
        assertNull(budget2.getId());//null before save
        this.budgetRepository.save(budget1);
        this.budgetRepository.save(budget2);
        assertNotNull(budget1.getId());
        assertNotNull(budget2.getId());
    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Optional<Budget> departmentA = budgetRepository.findById(2);
        assertNotNull(departmentA);
        departmentA.ifPresent(department -> Assertions.assertEquals(0.00,department.getAmount()));
        /*Get all budgets, list should only have two*/
        Iterable<Budget> budgets= budgetRepository.findAll();
        int count = 0;
        for(Budget b : budgets){
            count++;
        }
        assertEquals(count, 2);
    }
}
