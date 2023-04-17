package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.annotations.Vehcial;

@SpringBootApplication
public class Demo2Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Demo2Application.class, args);
		ConfigurableApplicationContext context = 
				SpringApplication.run(Demo2Application.class, args);
		        Vehcial v = context.getBean(Vehcial.class);
		        v.disp();
	}
}
