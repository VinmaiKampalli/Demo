package com.example.demo.persistance;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> 
{
   
}
