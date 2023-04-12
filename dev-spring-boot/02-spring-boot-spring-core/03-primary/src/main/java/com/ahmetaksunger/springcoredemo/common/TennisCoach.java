package com.ahmetaksunger.springcoredemo.common;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements CoachService {
    @Override
    public String getDailyWorkout() {
        return "Practice some forehand";
    }
}
