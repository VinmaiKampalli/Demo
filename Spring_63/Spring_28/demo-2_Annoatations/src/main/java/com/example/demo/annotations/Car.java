package com.example.demo.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Car 
{	
	public void followSafety() 
	{
		System.out.println("Car must follow saftey rules");
	}
	public void speed()
	{
	  System.out.println("Car must slow down");
	}

}
