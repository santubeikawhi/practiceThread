package com.jl.thread.daemonThread;

/**
 * @ClassName DaemonThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 22:26
 * @Version 1.0
 */
public class DaemonThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
