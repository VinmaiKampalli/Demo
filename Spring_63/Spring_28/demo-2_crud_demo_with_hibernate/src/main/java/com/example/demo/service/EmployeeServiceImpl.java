package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.persistance.EmployeeDAO;
import com.example.demo.persistance.EmployeeDAOHibernateImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeDAO empdao;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJPAImpl") EmployeeDAO  empdao) 
	{
		this.empdao =empdao;
	}
	@Override
	@Transactional
	public List<Employee> fetchAll() 
	{
		 return empdao.displayAll();
	}
	@Override
	@Transactional
	public Employee fetchById(int empid) 
	{
		return empdao.getEmployeeById(empid);
	}
	@Override
	@Transactional
	public void insertOrUpdate(Employee employee)
	{
		empdao.insertionOrUpdation(employee);
	}
	@Override
	@Transactional
	public void delete(int empid) 
	{
		empdao.deletion(empid);		
	}
}
