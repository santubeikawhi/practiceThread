package com.jl.thread.create;

/**
 * @ClassName MyRunnable
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 9:04
 * @Version 1.0
 */
public class MyRunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for(i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
