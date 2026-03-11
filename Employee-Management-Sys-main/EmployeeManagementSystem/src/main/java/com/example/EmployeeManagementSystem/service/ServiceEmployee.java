package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.exception.ExceptionEmployee;
import com.example.EmployeeManagementSystem.mapper.MapperEmployee;
import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.repository.RepositoryEmployee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceEmployee implements ServiceEmployeeIn {

    private final RepositoryEmployee repositoryEmployee;

    // Constructor Injection
    public ServiceEmployee(RepositoryEmployee repositoryEmployee) {
        this.repositoryEmployee = repositoryEmployee;
    }

    @Override
    public DtoEmployee createEmployee(DtoEmployee dtoEmployee) {

        if (dtoEmployee == null) {
            throw new ExceptionEmployee("Employee data cannot be null");
        }

        Employee employee = MapperEmployee.mapToEmployee(dtoEmployee);

        @SuppressWarnings("null")
        Employee savedEmployee = repositoryEmployee.save(employee);

        return MapperEmployee.mapToDtoEmployee(savedEmployee);
    }

    @Override
    public DtoEmployee findById(int id) {

        Employee employee = repositoryEmployee.findById(id)
                .orElseThrow(() -> new ExceptionEmployee("Employee not found with id " + id));

        return MapperEmployee.mapToDtoEmployee(employee);
    }

    @Override
    public List<DtoEmployee> findAllEmployee() {

        List<Employee> employees = repositoryEmployee.findAll();

        return employees.stream()
                .map(MapperEmployee::mapToDtoEmployee)
                .collect(Collectors.toList());
    }

    @Override
    public DtoEmployee updateEmployee(int id, DtoEmployee updatedEmployee) {

        Employee employee = repositoryEmployee.findById(id)
                .orElseThrow(() -> new ExceptionEmployee("Employee not found"));

        employee.setFirstname(updatedEmployee.getFirstname());
        employee.setLastname(updatedEmployee.getLastname());
        employee.setEmail(updatedEmployee.getEmail());

        Employee updatedEmployeeData = repositoryEmployee.save(employee);

        return MapperEmployee.mapToDtoEmployee(updatedEmployeeData);
    }

    @Override
    public void deleteEmployee(int id) {

        if (!repositoryEmployee.existsById(id)) {
            throw new ExceptionEmployee("Employee not found");
        }

        repositoryEmployee.deleteById(id);
    }
}