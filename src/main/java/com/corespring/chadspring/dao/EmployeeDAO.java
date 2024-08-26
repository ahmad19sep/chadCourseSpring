package com.corespring.chadspring.dao;

import com.corespring.chadspring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> listEmployees();
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);




}
