package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	private EmployeeService emSer;
	@GetMapping("/employee/{id}")
		public ResponseEntity<Employee>getEmployee(@PathVariable int id){
			return new ResponseEntity<>(emSer.getEmployeeById(id),HttpStatus.OK);
		}
}
