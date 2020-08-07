package com.nh.breedpigservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class BreedPigServiceApplication  extends WebBootStrap{

    public static void main(String[] args) {
        SpringApplication.run(BreedPigServiceApplication.class, args);
    }

}
