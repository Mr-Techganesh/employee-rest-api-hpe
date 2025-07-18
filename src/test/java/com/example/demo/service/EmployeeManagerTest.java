package com.example.demo.service;

import com.example.demo.model.Employees;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    @Test
    public void testGetAllEmployees() {
        Employees employees = EmployeeManager.getAllEmployees();
        assertNotNull(employees);
        assertEquals(3, employees.getEmployees().size(), "There should be 3 employees initially");
    }
}