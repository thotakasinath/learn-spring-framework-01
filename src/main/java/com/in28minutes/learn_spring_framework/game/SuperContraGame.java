package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{

	public void up() {
		System.out.println("SuperContraGame jump");
	}
	public void down() {
		System.out.println("SuperContraGame go into the hole");
	}
	public void left() {
		System.out.println("SuperContraGame Go back");
	}
	public void right() {
		System.out.println("SuperContraGame Accelerate");
	}
}
