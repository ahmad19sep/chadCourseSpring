package com.corespring.chadspring.springCore.Injection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private CricketCoach cricketCoach;
    public DemoController(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/dailyWork")
    public String dailyWork() {
        return cricketCoach.getWorkOut();
    }
}
