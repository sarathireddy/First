package com.example.client.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.client.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmpService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String  updateEmpSal(Employee employee) {
		employeeRepository.save(employee);
		return "employee data update successfully";
	}

	public List<Employee>  getEmployee() {
		employeeRepository.save(employee);
		return "employee data update successfully";
	}
}
