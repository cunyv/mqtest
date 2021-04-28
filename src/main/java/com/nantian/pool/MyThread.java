package com.nantian.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhangjian
 * @Date 2021/4/23 10:06
 * @Description TODO
 */
public class MyThread {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
        //允许为核心线程设置超时时间，设置了这个之后超时时间到了程序就停止了
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        //初始化就启动所有核心线程
        threadPoolExecutor.prestartAllCoreThreads();
        for (int i = 0; i < 15; i++) {
            threadPoolExecutor.execute(new MyRunnable("cunyv", "hebei", 28, i));
            System.out.println("线程池中线程数目：" + threadPoolExecutor.getPoolSize() + "，队列中等待执行的任务数目：" +
                    threadPoolExecutor.getQueue().size() + "，已执行完别的任务数目：" + threadPoolExecutor.getCompletedTaskCount());
        }
        //关闭
        threadPoolExecutor.shutdown();

    }

}

class MyRunnable implements Runnable {
    private String name;
    private String address;
    private Integer age;
    private Integer count;

    public MyRunnable() {
    }

    public MyRunnable(String name, String address, Integer age, Integer count) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            //执行逻辑放到这里
            System.out.println("正在执行task" + count);
            System.out.println("name:" + name + "\n" + "address:" + address + "\n" + "age:" + age);
            System.out.println("className:" + Class.forName("com.nantian.pool.MyThread").getName());
            Thread.sleep(4000);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count + "执行完毕");
    }
}
