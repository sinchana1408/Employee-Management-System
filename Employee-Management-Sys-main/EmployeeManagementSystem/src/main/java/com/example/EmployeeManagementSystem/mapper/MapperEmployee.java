package com.example.EmployeeManagementSystem.mapper;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.model.Employee;

public class MapperEmployee {

    public static Employee mapToEmployee(DtoEmployee dto){
        return new Employee(
                dto.getId(),
                dto.getFirstname(),
                dto.getLastname(),
                dto.getEmail()
        );
    }

    public static DtoEmployee mapToDtoEmployee(Employee employee){
        return new DtoEmployee(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
        );
    }
}