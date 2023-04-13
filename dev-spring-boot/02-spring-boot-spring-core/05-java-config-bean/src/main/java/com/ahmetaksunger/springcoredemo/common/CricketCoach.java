package com.ahmetaksunger.springcoredemo.common;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements CoachService {

    public CricketCoach(){
        System.out.println("cricket coach constructor");

    }
    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling";
    }
}
