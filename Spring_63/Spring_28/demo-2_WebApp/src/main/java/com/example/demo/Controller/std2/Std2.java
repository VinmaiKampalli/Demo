package com.example.demo.Controller.std2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Controller.Student;

@Service
public class Std2 
{
	public  List<Student> Std() 
	{
	   ArrayList <Student> ab = new ArrayList<Student>();
	   Student a1 = new Student(1,"Ariana",'f');
	   Student a2 = new Student(2,"selena",'f');
	   Student a3 = new Student(3,"weeknd",'m');
	   ab.add(a3);
	   ab.add(a2);
	   ab.add(a1);
	   return ab;
	}
		
}
