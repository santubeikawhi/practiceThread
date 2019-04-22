package com.jl.thread.ThreadJoin;

/**
 * @ClassName SleepRunnableB
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 9:00
 * @Version 1.0
 */
public class MyRunnableB implements Runnable {
    @Override
    public void run() {
        for(int i =0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
