package com.baseball;

public class MyApp {

	public static void main(String[] args) {
		//creating object
		//Coach theCoach=new TrackCoach();
		Coach theCoach1=new BaseballCoach();
		
		//using those object
		//System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());

	}

}
