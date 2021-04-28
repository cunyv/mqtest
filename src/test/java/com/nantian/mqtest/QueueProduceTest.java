package com.nantian.mqtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zhangjian
 * @Date 2021/4/19 15:17
 * @Description TODO
 */
@SpringBootTest
class QueueProduceTest {

    @Autowired
    QueueProduce queueProduce;

    @Test
    void produceMsg() {
        queueProduce.produceMsg();
    }
}