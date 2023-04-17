package com.example.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Car_trucks
{
	public void followSafety() 
	{
		System.out.println("Truck must follow saftey rules");
	}
	public void speed()
	{
		System.out.println("Speed thrills but kills");
	}
}
