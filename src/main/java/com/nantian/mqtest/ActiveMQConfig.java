package com.nantian.mqtest;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @Author zhangjian
 * @Date 2021/4/19 10:51
 * @Description TODO
 */
@Component
@EnableJms
public class ActiveMQConfig {

    @Value("${jobqueue}")
    private String jobQueue;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(jobQueue);
    }
}
