package com.ahmetaksunger.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private CoachService coachService;

    @Autowired
    public DemoController(CoachService coachService){

        this.coachService = coachService;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return coachService.getDailyWorkout();

    }

}
