package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	public List<Employee> fetchAll(); //select
	public Employee fetchById(int empid);  //select based on id
	public void insertOrUpdate(Employee employee); //insert //update
	public void delete(int empid);  //delete
}
