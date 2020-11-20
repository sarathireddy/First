package com.example.client.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query("select a from Employee a where a.sal <= :sal")
	List<Employee> findBySal(String sal);

  
}