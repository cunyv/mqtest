package com.nantian.mqtest.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

import java.util.Random;

/**
 * @Author zhangjian
 * @Date 2021/5/18 15:41
 * @Description TODO
 */
public class HHH {

    private static Logger logger = LoggerFactory.getLogger(HHH.class);

    public static void main(String[] args) {
    }

    @Async(value = "asyncServiceExecutor")
    public void executeAsync(int i) {
        logger.info("start executeAsync");
        System.out.println("异步线程要做的事情" + i);
        System.out.println("可以在这里执行批量插入等耗时的事情" + i);
        logger.info("end executeAsync");
    }
}
