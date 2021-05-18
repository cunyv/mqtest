package com.nantian.mqtest.pool;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author zhangjian
 * @Date 2021/5/18 16:44
 * @Description TODO
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AsyncServiceImplTest {

    @Autowired
    AsyncService asyncService;

    @Test
    void executeAsync() {
        HHH hhh = new HHH();
        for (int i = 0; i < 10; i++) {
            hhh.executeAsync(i);
            //asyncService.executeAsync(i);
        }
    }
}