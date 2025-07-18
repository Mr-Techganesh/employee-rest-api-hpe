package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.Employees;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private static Employees employeesList = new Employees(new ArrayList<>());

    static {
        employeesList.getEmployees().add(new Employee(1, "Alice", "Smith", "alice@example.com", "Developer"));
        employeesList.getEmployees().add(new Employee(2, "Bob", "Johnson", "bob@example.com", "Manager"));
        employeesList.getEmployees().add(new Employee(3, "Carol", "Williams", "carol@example.com", "Tester"));
    }

    public static Employees getAllEmployees() {
        return employeesList;
    }
}