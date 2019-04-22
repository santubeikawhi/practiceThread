package com.jl.thread.threadRunnable;

/**
 * @ClassName TRThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 21:39
 * @Version 1.0
 */
public class TRThread extends Thread {
    private int i = 0;

    public TRThread(Runnable runnable) {
        super(runnable);
    }

    @Override
    public void run(){
        System.out.println("in TRThread run");
        for(i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
