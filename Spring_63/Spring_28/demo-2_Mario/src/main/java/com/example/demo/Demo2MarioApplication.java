package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.game.GameRunner;

@SpringBootApplication
public class Demo2MarioApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Demo2MarioApplication.class, args);
		ConfigurableApplicationContext context=
				SpringApplication.run(Demo2MarioApplication.class, args);
		GameRunner g=context.getBean(GameRunner.class);
		g.runner();
	}
}
