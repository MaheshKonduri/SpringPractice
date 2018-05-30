package com.baseball;

public class BaseballCoach implements Coach {
	
	@Override 
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "hey here come from basballcoach class" ;
	}

}
