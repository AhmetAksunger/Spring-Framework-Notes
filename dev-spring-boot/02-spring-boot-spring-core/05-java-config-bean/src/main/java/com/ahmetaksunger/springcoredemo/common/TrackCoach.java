package com.ahmetaksunger.springcoredemo.common;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements CoachService {


    public TrackCoach(){
        System.out.println("track coach constructor");

    }

    @Override
    public String getDailyWorkout() {
        return "Run harder!";
    }
}
