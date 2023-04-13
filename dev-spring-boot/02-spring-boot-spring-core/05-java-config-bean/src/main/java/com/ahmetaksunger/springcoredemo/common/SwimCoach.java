package com.ahmetaksunger.springcoredemo.common;

// not using component on purpose
public class SwimCoach  implements CoachService{
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }
}
