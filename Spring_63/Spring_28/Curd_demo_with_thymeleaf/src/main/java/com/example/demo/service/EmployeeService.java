package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	public List<Employee> getAll();
	public Employee getById(int id);
	public void insertOrUpdate(Employee employee);
	public void delete(int id);
	public  List<Employee> searchBy(String name);

}
