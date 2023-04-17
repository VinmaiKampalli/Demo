package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		this.emprep = emprep;
	}
	@Override
	public List<Employee> getAll()
	{
		return emprep.findAll();
	}
	@Override
	public Employee getById(int id)
	{
		return emprep.findById(id).get();
	}
	@Override
	public void insertOrUpdate(Employee employee)
	{
		emprep.save(employee);
		
	}
	@Override
	public void delete(int id) 
	{
		emprep.deleteById(id);
	}

      public List<Employee> searchBy(String name) {
		
		   List<Employee> employees =null;
		    if(name!=null && name.length()>0)
			    employees=emprep.findByFirstNameContainsOrLastNameContainsAllIgnoreCase(name, name);			
	       return employees;
	}

}
