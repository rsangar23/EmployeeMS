package com.springwork.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwork.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
