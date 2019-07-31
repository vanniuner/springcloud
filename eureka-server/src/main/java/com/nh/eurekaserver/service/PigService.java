package com.nh.eurekaserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PigService {
    Logger logger = LoggerFactory.getLogger(PigService.class);

    public void printCn(){
        logger.info("printcn");
    }
}
