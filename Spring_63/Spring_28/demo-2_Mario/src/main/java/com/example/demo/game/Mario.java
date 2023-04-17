package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario 
{
public void up()
{
	System.out.println("Mario Moving Up..");
}
public void down()
{
	System.out.println("Mario Moving Down..");
}
public void left()
{
	System.out.println("Mario Moving Left..");
}
public void right()
{
	System.out.println("Mario Moving Right..");
}
}


