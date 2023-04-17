package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.persistance.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeRepository emprep;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository emprep)
	{
		this.emprep =emprep;
	}
	@Override
	@Transactional
	public List<Employee> fetchAll() 
	{
		 return emprep.findAll();
	}
	@Override
	@Transactional
	public Employee fetchById(int empid)
	{
		return emprep.findById(empid).get();
	}
	@Override
	@Transactional
	public void insertOrUpdate(Employee employee) 
	{
		emprep.save(employee);
	}
	@Override
	@Transactional
	public void delete(int empid)
	{
		emprep.deleteById(empid);	
	}
}