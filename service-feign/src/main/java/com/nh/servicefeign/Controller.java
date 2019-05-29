package com.nh.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    IService iService;

    @RequestMapping(value = "serviceA")
    public String serviceA(){
        return iService.serviceA();
    }
}
