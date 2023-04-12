package com.ahmetaksunger.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements CoachService {
    @Override
    public String getDailyWorkout() {
        return "Practice some baseball";
    }
}
