package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class SuperMario implements GamingConsole
{
	public void up()
	{
		System.out.println("SuperMario Moving Up..");
	}
	public void down()
	{
		System.out.println("SuperMario Moving Down..");
	}
	public void left()
	{
		System.out.println("SuperMario Moving Left..");
	}
	public void right()
	{
		System.out.println("SuperMario Moving Right..");
	}
}