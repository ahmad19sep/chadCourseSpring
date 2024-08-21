package com.corespring.chadspring.springCore.Injection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach{

    @Override
    public String getWorkOut() {
        return "do practice for bowling daily";
    }
}
