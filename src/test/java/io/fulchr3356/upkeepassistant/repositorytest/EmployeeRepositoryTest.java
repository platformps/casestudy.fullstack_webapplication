package io.fulchr3356.upkeepassistant.repositorytest;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.models.EmployeeBuilder;
import org.junit.Before;
import org.junit.Test;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp(){
        Employee employee=  new EmployeeBuilder()
                .withFirstName("Christopher")
                .withLastName("Fulton")
                .withEmail("fulchr3356@gmail.com")
                .withSalary(100000.00).build();
        Employee employee2=  new EmployeeBuilder()
                .withFirstName("Greg")
                .withLastName("Fulton")
                .withEmail("fulchr3356@gmail3.com")
                .withSalary(100000.00).build();
        assertNull(employee.getId());
        assertNull(employee2.getId());
        employeeRepository.save(employee);
        employeeRepository.save(employee2);
        assertNotNull(employee.getId());
        assertNotNull(employee2.getId());

    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Optional<Employee> employeeA = employeeRepository.findById(1);
        assertNotNull(employeeA);
        employeeA.ifPresent(employee -> assertEquals("Christopher", employee.getFirstName()));
        /*Get all products, list should only have two*/
        Collection<Employee> employees = employeeRepository.findAll();
        int count = 0;
        for(Employee e : employees){
            count++;
        }
        assertEquals(count,2);

    }

}
