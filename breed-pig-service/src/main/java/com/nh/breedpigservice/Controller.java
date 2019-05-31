package com.nh.breedpigservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ServiceDemo serviceDemo;

    @RequestMapping(value = "consume")
    public String cons(){
        return serviceDemo.consume();
    }


}
