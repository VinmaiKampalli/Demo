package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Couple.Car;
import com.example.demo.Couple.Vehical;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Demo1Application.class, args);
		Car c = new Car();
		Vehical v = new Vehical(c);
		v.show();
	}

}
