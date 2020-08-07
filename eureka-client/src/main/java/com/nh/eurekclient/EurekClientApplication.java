package com.nh.eurekclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekClientApplication {

    @Value("${server.port}")
    String prot;

    public static void main(String[] args) {
        SpringApplication.run(EurekClientApplication.class, args);
    }

    @RequestMapping(value = "serverA")
    public String serverA(){
        return "successA-" + prot;
    }

    @RequestMapping(value = "serverB")
    public String serverB(){
        return "successB-" + prot;
    }
}
