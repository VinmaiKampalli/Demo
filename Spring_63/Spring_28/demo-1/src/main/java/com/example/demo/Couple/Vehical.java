package com.example.demo.Couple;

public class Vehical 
{ 
	private Car_trucks ct;
	public Vehical(Car_trucks ct) 
	{
		this.ct= ct;
	}
	public void show()
	{
		ct.followSafety();
		ct.speed();
	}
}
