package com.in28minutes.learn_spring_framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;

public class App03GamingspringBeans {

	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
