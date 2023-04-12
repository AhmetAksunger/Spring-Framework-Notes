package com.ahmetaksunger.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements CoachService {
    @Override
    public String getDailyWorkout() {
        return "Practice some baseball";
    }
}
