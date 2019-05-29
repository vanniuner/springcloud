package com.nh.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class ErrorService implements IService {
    @Override
    public String serviceA() {
        return "服务器繁忙";
    }
}
