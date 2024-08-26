package com.corespring.chadspring.dao;

import com.corespring.chadspring.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> listEmployees() {
        TypedQuery<Employee> query = entityManager.createQuery("From Employee ", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;

    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {

        entityManager.merge(employee);
        return employee;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);

    }
}
