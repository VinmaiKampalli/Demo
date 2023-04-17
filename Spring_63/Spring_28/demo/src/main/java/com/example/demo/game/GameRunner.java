package com.example.demo.game;

public class GameRunner 
{
	Mario m = new Mario();
	Super_mario sm = new Super_mario();
	public  void Display()
	{
		m.up();
		m.down();
		m.left();
		m.right();
	}
	public void show() 
	{
		sm.up();
		sm.down();
		sm.left();
		sm.right();
	}
}
