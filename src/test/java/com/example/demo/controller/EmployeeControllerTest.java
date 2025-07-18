package com.example.demo.controller;

import com.example.demo.model.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeControllerTest {

    @Test
    public void testGetEmployeesNotNull() {
        EmployeeController controller = new EmployeeController();
        Employees employees = controller.getEmployees();
        assertNotNull(employees);
        assertFalse(employees.getEmployees().isEmpty(), "Employee list should not be empty");
    }

    @Test
    public void testGetEmployeesSize() {
        EmployeeController controller = new EmployeeController();
        Employees employees = controller.getEmployees();
        assertEquals(3, employees.getEmployees().size(), "There should be 3 employees initially");
    }
}