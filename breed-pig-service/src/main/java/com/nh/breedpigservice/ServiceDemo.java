package com.nh.breedpigservice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceDemo {


    public String consume(){
        RestTemplate restTemplate1 = new RestTemplate();
        return restTemplate1.getForObject("http://localhost:8088/demo/eureka-client/serverA",String.class);
    }

}
