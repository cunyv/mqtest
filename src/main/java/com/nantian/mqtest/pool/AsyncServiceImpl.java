package com.nantian.mqtest.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author zhangjian
 * @Date 2021/5/18 16:43
 * @Description TODO
 */
@Service
public class AsyncServiceImpl implements AsyncService{
    private static Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Override
    @Async(value = "asyncServiceExecutor")
    public void executeAsync(int i) {
        logger.info("start executeAsync");
        System.out.println("异步线程要做的事情" + i);
        System.out.println("业务逻辑" + i);
        logger.info("end executeAsync");
    }
}
