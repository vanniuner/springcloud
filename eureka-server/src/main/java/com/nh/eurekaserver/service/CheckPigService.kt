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
        val str = "start vaild"
        logger.info("{}",str)
        logger.info("javaclass.name:{}",str.javaClass.name)
        pigService.printCn()
    }

}