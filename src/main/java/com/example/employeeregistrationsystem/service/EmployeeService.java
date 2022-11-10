package com.example.employeeregistrationsystem.service;

import com.example.employeeregistrationsystem.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();
    void save(Employee employee);
    Optional<Employee> findById(int id);
    void deleteById(int id);

}
