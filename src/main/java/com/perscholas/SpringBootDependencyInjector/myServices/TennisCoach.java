package com.perscholas.SpringBootDependencyInjector.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneServices fortuneServices;

    private FortuneServices fortuneService;
    public TennisCoach() {
        // this is default constructor
    }
//    @Autowired
//    public TennisCoach(FortuneServices theFortuneService) {
//        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}






