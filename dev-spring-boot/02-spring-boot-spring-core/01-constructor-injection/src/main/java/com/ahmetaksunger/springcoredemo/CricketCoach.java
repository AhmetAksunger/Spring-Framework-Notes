package com.ahmetaksunger.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements CoachService {
    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling";
    }
}
