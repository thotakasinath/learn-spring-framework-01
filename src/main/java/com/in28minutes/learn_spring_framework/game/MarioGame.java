package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("go into the hole");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}
