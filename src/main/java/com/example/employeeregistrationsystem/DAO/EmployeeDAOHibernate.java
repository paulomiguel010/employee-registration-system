package com.example.employeeregistrationsystem.DAO;

import com.example.employeeregistrationsystem.entity.Employee;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAOHibernate {

    List<Employee> findAll();
    void save(Employee employee);
    Optional<Employee> findById(int id);
    void deleteById(int id);

}

