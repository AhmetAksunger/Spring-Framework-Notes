package com.ahmetaksunger.springcoredemo.common;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements CoachService {


    public TennisCoach(){
        System.out.println("tennis coach constructor");

    }

    @Override
    public String getDailyWorkout() {
        return "Practice some forehand";
    }
}
