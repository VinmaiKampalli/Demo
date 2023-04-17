package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public class EmployeeDAOJPAImpl  implements EmployeeDAO{
private EntityManager entitymanager;
	
	@Autowired
	public EmployeeDAOJPAImpl(EntityManager entitymanager)
	{
		this.entitymanager = entitymanager;
	}
	@Override
	public List<Employee> displayAll() 
	{
	Query query=entitymanager.createQuery("from Employee",Employee.class);
	List<Employee> employees= query.getResultList();
		return employees;
	}
	@Override
	public Employee getEmployeeById(int empid) 
	{
		Employee employee=entitymanager.find(Employee.class,empid);
		return employee;
	}
	@Override	
	public void insertionOrUpdation(Employee employee)
	{
		entitymanager.merge(employee);
	}
	@Override
	public void deletion(int empid) 
	{
		Query query=entitymanager.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId",empid);
		query.executeUpdate();
	}
}
