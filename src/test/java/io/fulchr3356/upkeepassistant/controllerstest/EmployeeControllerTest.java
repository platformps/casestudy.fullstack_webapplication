//package io.fulchr3356.upkeepassistant.controllerstest;
//
//
//import io.fulchr3356.upkeepassistant.controllers.EmployeeController;
//import io.fulchr3356.upkeepassistant.models.Employee;
//import io.fulchr3356.upkeepassistant.models.EmployeeBuilder;
//import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
//import io.fulchr3356.upkeepassistant.repositories.UserRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EmployeeControllerTest {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//    @Autowired
//    private UserRepository userRepository;
//
//    EmployeeController controller;
//    @Before
//    public void setUp() throws Exception {
//        this.controller = new EmployeeController(employeeRepository,userRepository );
//        this.controller.add(new EmployeeBuilder()
//                .withFirstName("Christopher")
//                .withLastName("Fulton")
//                .withEmail("fulchr3356@gmail.com")
//                .withPassword("password")
//                .withSalary(100000.00).build());
//    }
//    @Test
//    public void testReadAll(){
//        controller.findAll().forEach(employee -> System.out.println(employee.toString()));
//        assertNotNull(controller.findAll());
//
//    }
//
//    @Test
//    public void testFindById(){
//        ResponseEntity<?> employeeA = controller.findById(1);
//        System.out.println(employeeA.toString());
//        assertNotNull(employeeA);
//    }
//}
