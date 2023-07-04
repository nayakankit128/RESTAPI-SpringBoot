package com.springboot.api.controller;

import com.springboot.api.model.Employee;
import com.springboot.api.response.ResponseHandler;
import com.springboot.api.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getEmployeeDetail(@PathVariable("id") String id){
        return ResponseHandler.responseBuilder("response from client is given here", HttpStatus.OK,
                employeeService.getEmployee(id));

    }

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public String createEmployeeDetails(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return "Employee create successfully";
    }

    @PutMapping
    public String updateEmpoloyeeDetails(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return "Employee update Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable("id") String id){
        employeeService.deleteEmployee(id);
        return "Employee Delete Successfully";
    }

}
