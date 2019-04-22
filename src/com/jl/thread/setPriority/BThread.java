package com.jl.thread.setPriority;

/**
 * @ClassName BThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/17 10:00
 * @Version 1.0
 */
public class BThread extends Thread {
    private CThread cThread;

    public CThread getcThread() {
        return cThread;
    }

    public void setcThread(CThread cThread) {
        this.cThread = cThread;
    }

    public BThread(CThread cThread) {
        this.cThread = cThread;
    }

    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"BThread:"+i);
            if(i==7){
                cThread.setPriority(Thread.MIN_PRIORITY);
                cThread.start();
                Thread.yield();
            }
        }
    }
}
