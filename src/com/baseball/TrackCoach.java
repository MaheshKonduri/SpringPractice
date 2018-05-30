package com.baseball;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5k minimum in part of daily activity";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Created Just do it: "+fortuneService.getFortune();
	}

}
