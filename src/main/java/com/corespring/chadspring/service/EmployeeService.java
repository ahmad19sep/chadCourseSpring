package com.corespring.chadspring.service;

import com.corespring.chadspring.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> listEmployees();
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
