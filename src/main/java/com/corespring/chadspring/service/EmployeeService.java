package com.corespring.chadspring.service;

import com.corespring.chadspring.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    void saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
