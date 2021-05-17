package com.nantian.pool;

/**
 * @Author zhangjian
 * @Date 2021/4/23 10:06
 * @Description TODO
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        System.out.println("开始启动线程  ssss"+ Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getId()+" 线程结束  dddd  time:"+(System.currentTimeMillis()-time));
    }
}
