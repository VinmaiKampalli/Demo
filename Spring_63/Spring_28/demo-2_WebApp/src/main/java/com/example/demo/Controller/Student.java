package com.example.demo.Controller;

public class Student
{
	private int id;
	private String name;
	private char gender;
	public Student() 
	{
		super();
	}
	public Student(int id, String name, char gender) 
	{
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public char getGender()
	{
		return gender;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public String toString()
	{
		return "Author [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}
