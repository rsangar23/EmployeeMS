package com.springwork.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springwork.ems.entity.Employee;


@Service
public interface EmployeeService {
	
List<Employee> getAllEmployees();
	
Employee saveEmployee(Employee employee);
	
Employee getEmployeeById(Long id);
	
Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

}
