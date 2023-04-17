package com.example.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Vehcial
{
	private Car_trucks ct;
	
	@Autowired
	public Vehcial(@Qualifier("truck") Car_trucks ct)
	{
		this.ct=ct;
	}
	public void disp() 
	{
		ct.followSafety();
		ct.speed();
	}
}
