package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.game.GameRunner;

@SpringBootApplication
public class DemoApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
		GameRunner gm = new GameRunner();
		gm.Display();
		System.out.println("");
		gm.show();
	}

}
