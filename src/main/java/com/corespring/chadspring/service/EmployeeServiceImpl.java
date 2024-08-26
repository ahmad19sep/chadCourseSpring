package com.corespring.chadspring.service;

import com.corespring.chadspring.dao.EmployeeDAO;
import com.corespring.chadspring.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDao = employeeDAO;
    }

    @Override
    public List<Employee> listEmployees() {
        return employeeDao.listEmployees();
    }

    @Override
    public Employee getEmployee(int id) {
       return employeeDao.getEmployee(id);

    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
      employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {

        return employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
       employeeDao.deleteEmployee(id);

    }
}
