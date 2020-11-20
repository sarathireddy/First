package com.example.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.service.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private ProductService productService;
	
	@PutMapping("/employee/place/{place}/salary/{percentage}")
	publuc String updateEmployeeSalary(@pathvariable String place,@pathvariable long sal,@Requestbody Employee employee) {
		
		try {
			employee.setPlace(place);
			employee.setSa(sal);
		return	productService.updateEmpSal(employee);
			
		}
		catch(Exeception e) {
			
		}
	}
	@GetMapping("/list")
	publuc List<Employee> getEmployee() {
		return 	productService.getEmp(employee);
	}
	
	@GetMapping("/{range}")
	publuc List<Employee> getEmployee(@pathvariable String sal) {
		return 	productService.getEmpSal(employee);
	}
}
