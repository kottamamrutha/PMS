package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
