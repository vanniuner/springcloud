package com.nh.eurekaserver.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CheckPigService {

    val logger:Logger = LoggerFactory.getLogger(this.javaClass);

    @Autowired
    lateinit var pigService:PigService

    fun check(){
        logger.info("{}","正在开始校验")
        pigService.printCn()
    }
}