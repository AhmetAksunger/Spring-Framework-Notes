package com.springbootcourse.springboot1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello(){

        return "Hello World";

    }

    @GetMapping("/workout")
    public String getDailyWorkout(){

        return "Do 1000 push ups";

    }

}
