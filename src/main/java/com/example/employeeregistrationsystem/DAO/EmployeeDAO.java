package com.example.employeeregistrationsystem.DAO;

import com.example.employeeregistrationsystem.entity.Employee;

import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {



}
