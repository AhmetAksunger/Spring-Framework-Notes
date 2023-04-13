package com.ahmetaksunger.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements CoachService {


    public BaseballCoach(){
        System.out.println("baseball coach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice some baseball";
    }
}
