package com.ahmetaksunger.springcoredemo.rest;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private CoachService coachService;

    @Autowired
    public DemoController(@Qualifier("customBeanId") CoachService coachService){

        this.coachService = coachService;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return coachService.getDailyWorkout();

    }

}
