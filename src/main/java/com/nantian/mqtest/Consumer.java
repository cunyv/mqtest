package com.nantian.mqtest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Author zhangjian
 * @Date 2021/4/19 14:10
 * @Description TODO
 */
//@Component
public class Consumer {

//    @JmsListener(destination = "job-queue")
    public void receive(TextMessage textMessage){
        try {
        System.out.println("=====================");
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        System.out.println(textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
