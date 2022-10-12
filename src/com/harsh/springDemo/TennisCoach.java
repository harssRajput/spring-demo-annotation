package com.harsh.springDemo;

import org.springframework.stereotype.Component;

@Component("mySillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice Tennis for 30 minutes every hour :)";
	}

}
