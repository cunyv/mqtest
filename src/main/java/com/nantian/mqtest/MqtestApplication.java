package com.nantian.mqtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Controller
@RequestMapping("/hello")
public class MqtestApplication {

    @Autowired
    QueueProduce queueProduce;

    public static void main(String[] args) {
        SpringApplication.run(MqtestApplication.class, args);
    }


    @GetMapping("/queue")
    @ResponseBody
    public String queue(){
        queueProduce.produceMsg();
        return "nihao";
    }
}
