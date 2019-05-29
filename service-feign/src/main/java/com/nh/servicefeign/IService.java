package com.nh.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EUREKA-CLIENT",fallback = ErrorService.class)
public interface IService {

    @RequestMapping(value = "/eureka-client/serverA",method = RequestMethod.GET)
    String serviceA();
}
