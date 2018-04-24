package com.linuslan.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
