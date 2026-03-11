package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.service.ServiceEmployeeIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employees")

public class ControllerEmployee {

    @Autowired
    private ServiceEmployeeIn serviceEmployee;

    @PostMapping
    public ResponseEntity<DtoEmployee> createEmployee(@RequestBody DtoEmployee dto){

        return ResponseEntity.ok(serviceEmployee.createEmployee(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DtoEmployee> getEmployee(@PathVariable int id){

        return ResponseEntity.ok(serviceEmployee.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<DtoEmployee>> getAllEmployees(){

        return ResponseEntity.ok(serviceEmployee.findAllEmployee());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DtoEmployee> updateEmployee(@PathVariable int id,
                                                      @RequestBody DtoEmployee dto){

        return ResponseEntity.ok(serviceEmployee.updateEmployee(id,dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){

        serviceEmployee.deleteEmployee(id);

        return ResponseEntity.ok("Employee deleted successfully");
    }
}