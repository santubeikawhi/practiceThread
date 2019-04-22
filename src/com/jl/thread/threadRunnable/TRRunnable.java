package com.jl.thread.threadRunnable;

/**
 * @ClassName TRRunnable
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 21:35
 * @Version 1.0
 */
public class TRRunnable implements Runnable {
    private int i = 0;
    @Override
    public void run() {
        System.out.println("in MyRunnable run");
        for(i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
