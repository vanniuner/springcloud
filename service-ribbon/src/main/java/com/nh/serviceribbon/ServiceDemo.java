package com.nh.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceDemo {

    @Autowired
    private RestTemplate restTemplate1;

    @HystrixCommand(fallbackMethod = "cutError")
    public String consume(){
       return restTemplate1.getForObject("http://EUREKA-CLIENT/eureka-client/serverA",String.class);
    }

    public String cutError(){
        return "服务器繁忙";
    }
}
