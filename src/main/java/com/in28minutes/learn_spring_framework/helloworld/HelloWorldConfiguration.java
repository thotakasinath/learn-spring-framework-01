package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name,int age, Address address) {};
record Address(String firstLine,String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Kasi";
		
	}
	@Bean
	public int age() {
		return 15;
		
	}
    @Bean
    public Person person() {
		return new Person("yuvan",1, new Address("GV puram","giddalur"));
    	
    }
    @Bean(name="address1")
    @Qualifier("address3qualifier")
    public Address address() {
		return new Address("venkataswara colony","giddalur");
    	
    }
    @Bean(name="address2")
    @Primary
    public Address address1() {
		return new Address("gachibowli colony","Hyderabad");
    	
    }
    
    @Bean
    public Person person3Parameter(String name,int age,Address address2) {
		return new Person(name,age, address2);
    	
    }
    
    @Bean
    public Person person2MethodCall () {
		return new Person(name(),age(), address());
    	
    }
    
    @Bean(name="person4qualifier")
    public Person person4qualifier(String name,int age,@Qualifier("address3qualifier") Address address) {
    	return new Person(name,age, address);
    	
    }
    
    
}
