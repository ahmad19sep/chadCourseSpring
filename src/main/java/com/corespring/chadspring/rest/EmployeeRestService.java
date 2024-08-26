package com.corespring.chadspring.rest;

import com.corespring.chadspring.entity.Employee;
import com.corespring.chadspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestService {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestService(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.listEmployees();
    }

    @GetMapping("/employees/{EmployeeId}")
    public Employee getEmployeeById(@PathVariable int EmployeeId) {
        return employeeService.getEmployee(EmployeeId);
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{EmployeeId}")
    public String deleteEmployee(@PathVariable int EmployeeId) {
        Employee findEmployee = employeeService.getEmployee(EmployeeId);
        if (findEmployee == null) {
            throw new RuntimeException("Employee not found + EmployeeId: " + EmployeeId);
        }
        employeeService.deleteEmployee(EmployeeId);
        return "Employee deleted Id:  " + EmployeeId;
    }


}

