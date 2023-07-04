package com.springboot.api.services;

import com.springboot.api.model.Employee;

import java.util.List;

public interface EmployeeService {

    public String createEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String employeeId);
    public Employee getEmployee(String employeeId);
    public List<Employee> getAllEmployee();
}
