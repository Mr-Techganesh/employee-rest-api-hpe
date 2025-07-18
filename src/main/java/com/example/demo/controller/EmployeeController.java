package com.example.demo.controller;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getEmployees() {
        return EmployeeManager.getAllEmployees();
    }
}