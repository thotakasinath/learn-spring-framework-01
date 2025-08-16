package com.in28minutes.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{

	public void up() {
		System.out.println("PacmanGame jump");
	}
	public void down() {
		System.out.println("PacmanGame go into the hole");
	}
	public void left() {
		System.out.println("PacmanGame Go back");
	}
	public void right() {
		System.out.println("PacmanGame Accelerate");
	}
}
