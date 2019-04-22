package com.jl.thread.setPriority;

/**
 * @ClassName AThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/17 10:00
 * @Version 1.0
 */
public class AThread extends Thread {
    private BThread bThread;

    public BThread getbThread() {
        return bThread;
    }

    public void setbThread(BThread bThread) {
        this.bThread = bThread;
    }

    public AThread(BThread bThread) {
        this.bThread = bThread;
    }

    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"AThread:"+i);
            if(i==3){
                bThread.setPriority(Thread.MAX_PRIORITY);
                bThread.start();
            }
        }
    }
}
