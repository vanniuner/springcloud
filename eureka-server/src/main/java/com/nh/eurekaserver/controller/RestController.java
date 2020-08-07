package com.nh.eurekaserver.controller;

import com.nh.eurekaserver.service.CheckPigService;
import com.nh.eurekaserver.service.PigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    CheckPigService checkPigService;

    @Autowired
    PigService pigService;

    @RequestMapping(value = "/test/kt")
    public String configTestKt(){
        checkPigService.check();
        return "ok";
    }

    @RequestMapping(value = "/test/java")
    public String configTestJvm(){
        pigService.printCn();
        return "ok";
    }
}
