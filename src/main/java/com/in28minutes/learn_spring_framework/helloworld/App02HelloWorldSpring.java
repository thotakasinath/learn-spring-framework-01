package com.in28minutes.learn_spring_framework.helloworld;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameter"));
			System.out.println(context.getBean(Address.class)); //No qualifying bean of type : expected single matching bean but found 2
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("---------------------------------------------------");
			System.out.println(context.getBean("person4qualifier"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}