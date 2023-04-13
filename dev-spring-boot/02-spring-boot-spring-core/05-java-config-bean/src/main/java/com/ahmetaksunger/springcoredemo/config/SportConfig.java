package com.ahmetaksunger.springcoredemo.config;

import com.ahmetaksunger.springcoredemo.common.CoachService;
import com.ahmetaksunger.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("customBeanId")
    public CoachService swimCoach(){

        return new SwimCoach();

    }

}
