package com.example.employeeregistrationsystem.service;

import com.example.employeeregistrationsystem.DAO.EmployeeDAO;
import com.example.employeeregistrationsystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
       employeeDAO.deleteById(id);
    }
}
