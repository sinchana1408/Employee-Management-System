package com.example.EmployeeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    // Dashboard page
    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

    // Add Employee Page
    @GetMapping("/addEmployee")
    public String addEmployee() {
        return "add-employee";
    }

    // View All Employees Page
    @GetMapping("/employees")
    public String employees() {
        return "employees";
    }

    // Update Employee Page (Optional)
    @GetMapping("/updateEmployee")
    public String updateEmployee(@RequestParam(required = false) Integer id) {
        return "add-employee"; 
    }

    // Delete Confirmation Page (Optional)
    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam(required = false) Integer id) {
        return "employees";
    }

}