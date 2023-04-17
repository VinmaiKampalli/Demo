package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAO 
{
public List<Employee> displayAll(); //select
public Employee getEmployeeById(int empid); //select based on id
public void insertionOrUpdation(Employee employee); //insert //update
public void deletion(int empid);  //delete
}
