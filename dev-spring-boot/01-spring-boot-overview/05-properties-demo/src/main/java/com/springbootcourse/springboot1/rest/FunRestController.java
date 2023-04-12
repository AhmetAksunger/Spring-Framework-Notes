package com.springbootcourse.springboot1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello(){

        return "Hello World";

    }

    @GetMapping("/workout")
    public String getDailyWorkout(){

        return "Do 1000 push ups";

    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){

        return "Coach: " + coachName + " Team name: " + teamName;

    }

}
