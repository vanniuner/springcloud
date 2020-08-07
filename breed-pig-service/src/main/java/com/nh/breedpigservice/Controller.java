package com.nh.breedpigservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    @Autowired
    ServiceDemo serviceDemo;

    @Value("${foo}")
    String a;

    @RequestMapping(value = "consume")
    public String cons(){
        return serviceDemo.consume() + a;
    }


}
