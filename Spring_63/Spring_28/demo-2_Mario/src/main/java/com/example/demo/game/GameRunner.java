package com.example.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner 
{
	private GamingConsole gc;
	
	@Autowired
	public GameRunner(@Qualifier("superMario") GamingConsole gc) {
		this.gc = gc;
	}
public void runner()
{
	gc.up();
	gc.down();
	gc.left();
	gc.right();
}
}