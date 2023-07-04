package com.springboot.api.services.impl;

import com.springboot.api.exception.EmployeeNotFoundException;
import com.springboot.api.model.Employee;
import com.springboot.api.repositort.EmployeeRepository;
import com.springboot.api.services.EmployeeService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Success";
    }

    @Override
    public String updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Success";
    }

    @Override
    public String deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Success";
    }

    @Override
    public Employee getEmployee(String employeeId) {
        if(employeeRepository.findById(employeeId).isEmpty())
            throw new EmployeeNotFoundException("Employee does not exit...");
       return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
