package com.baseball;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring configuartion file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		
		//FortuneService theCoach3=context.getBean("myCoach", FortuneService.class);
		
		Coach theCoach1=context.getBean("myCoach1", Coach.class);
		
		//cal methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println(theCoach1.getDailyWorkout());
		
		//close the context 
		context.close();

	}

}
