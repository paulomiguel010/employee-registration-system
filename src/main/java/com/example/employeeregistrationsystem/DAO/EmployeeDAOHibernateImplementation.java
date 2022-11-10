package com.example.employeeregistrationsystem.DAO;

import com.example.employeeregistrationsystem.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDAOHibernateImplementation implements EmployeeDAOHibernate{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImplementation(EntityManager entityManager){
         this.entityManager = entityManager;
    }
    @Transactional
    @Override
    public List<Employee> findAll() {
        // get the current hibernate session
         Session session =  entityManager.unwrap(Session.class);

         // create query
         Query<Employee> employeeQuery =session.createQuery("from Employee", Employee.class);

        // execute query get result list
          List<Employee> employees = employeeQuery.getResultList();

        // return result
        return employees;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public Optional<Employee> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {

    }
}
