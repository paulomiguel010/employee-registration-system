package com.example.employeeregistrationsystem.controller;

import com.example.employeeregistrationsystem.DAO.EmployeeDAO;
import com.example.employeeregistrationsystem.DAO.EmployeeDAOHibernate;
import com.example.employeeregistrationsystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeDAOHibernate employeeDAOHibernate;

    // inject imployee DAO(constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeDAOHibernate employeeDAOHibernate) {
        this.employeeDAOHibernate = employeeDAOHibernate;
    }

    // return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAOHibernate.findAll();
    }

}
