package com.jl.thread.ThreadJoin;

/**
 * @ClassName SleepRunnableA
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 8:55
 * @Version 1.0
 */
public class MyRunnableA implements Runnable{
    public Thread getOutsideThread() {
        return outsideThread;
    }

    public void setOutsideThread(Thread outsideThread) {
        this.outsideThread = outsideThread;
    }

    public MyRunnableA(Thread outsideThread) {
        this.outsideThread = outsideThread;
    }

    private Thread outsideThread;
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==3){
                if(outsideThread != null){
                    outsideThread.start();
                    try {
                        outsideThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
