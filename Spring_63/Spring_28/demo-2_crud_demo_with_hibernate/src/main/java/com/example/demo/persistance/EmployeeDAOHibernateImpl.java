package com.example.demo.persistance;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	private EntityManager entitymanager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entitymanager) 
	{
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Employee> displayAll()
	{
		// TODO Auto-generated method stub
		Session session=entitymanager.unwrap(Session.class);
		Query<Employee> query=session.createQuery("from Employee",Employee.class);
		List<Employee> employees=query.getResultList();
		return employees;
	}

	@Override
	public Employee getEmployeeById(int empid)
	{
		Session session=entitymanager.unwrap(Session.class);
		Employee employee=session.get(Employee.class,empid);
		return employee;
	}

	@Override
	public void insertionOrUpdation(Employee employee)
	{
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	public void deletion(int empid)
	{
		Session session=entitymanager.unwrap(Session.class);
		Query query=session.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId",empid);
		query.executeUpdate();
	}

}