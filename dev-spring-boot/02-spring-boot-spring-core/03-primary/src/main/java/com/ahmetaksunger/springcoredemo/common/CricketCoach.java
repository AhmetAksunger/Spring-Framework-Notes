package com.ahmetaksunger.springcoredemo.common;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements CoachService {
    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling";
    }
}
