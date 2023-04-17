package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
private EmployeeServiceImpl empserimpl;

@Autowired
public EmployeeController(EmployeeServiceImpl empserimpl) {
	this.empserimpl = empserimpl;
}
@GetMapping("/list")     //localhost:8080/employees/list
public List<Employee> displayDetails() {
	return empserimpl.fetchAll();
}
@GetMapping("/list/{employeeId}")
public Employee getById(@PathVariable int employeeId) throws Exception {
	Employee employee=empserimpl.fetchById(employeeId);
	if(employee==null)
		throw new Exception("Employee id is not found : "+employeeId);
 return employee;
}
@PostMapping("/list")
public Employee insertion(@RequestBody Employee employee) {
	employee.setId(0);
	empserimpl.insertOrUpdate(employee);
	return employee;
}
@PutMapping("/list")
public Employee updation(@RequestBody Employee employee) {
	empserimpl.insertOrUpdate(employee);	
	return employee;
}

@DeleteMapping("/list/{employeeId}")
public void deletion(@PathVariable int employeeId) throws Exception {
	Employee employee=empserimpl.fetchById(employeeId);
	if(employee==null)
		throw new Exception ("Id is not Found"+ employeeId);
empserimpl.delete(employeeId);
}
}