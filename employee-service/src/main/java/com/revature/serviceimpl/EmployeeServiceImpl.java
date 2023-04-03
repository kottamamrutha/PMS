package com.revature.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.EmployeeDto;
import com.revature.model.Employee;
import com.revature.repository.EmployeeRepository;
import com.revature.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository emRepo;
	
	@Override
	public Employee getEmployeeById(int id) {
		
		return emRepo.findById(id).get();
	}

}
