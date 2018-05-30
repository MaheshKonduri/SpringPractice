package com.baseball;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("hi this is HappyFortuneSrvice class its implemenents fortuneService interface");
		return "Today is happy day";
	}

}
