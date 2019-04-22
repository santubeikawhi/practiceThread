package com.jl.thread.ThreadSleep;

/**
 * @ClassName SleepRunnableB
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 9:17
 * @Version 1.0
 */
public class SleepRunnableB implements Runnable {
    @Override
    public void run() {
        for(int i=5;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
