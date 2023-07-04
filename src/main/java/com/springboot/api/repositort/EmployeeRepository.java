package com.springboot.api.repositort;

import com.springboot.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String>
{

}
