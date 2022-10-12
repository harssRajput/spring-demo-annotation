package com.harsh.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach myCoach = context.getBean("mySillyCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
