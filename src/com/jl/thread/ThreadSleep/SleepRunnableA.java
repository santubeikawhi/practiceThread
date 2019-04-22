package com.jl.thread.ThreadSleep;

/**
 * @ClassName SleepRunnableA
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 9:16
 * @Version 1.0
 */
public class SleepRunnableA implements Runnable {
    public SleepRunnableA(Thread outsideThread) {
        this.outsideThread = outsideThread;
    }

    public Thread getOutsideThread() {
        return outsideThread;
    }

    public void setOutsideThread(Thread outsideThread) {
        this.outsideThread = outsideThread;
    }

    private Thread outsideThread;
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==3){
                outsideThread.start();
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
