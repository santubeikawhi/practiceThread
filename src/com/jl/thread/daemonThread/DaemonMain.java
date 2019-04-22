package com.jl.thread.daemonThread;

/**
 * @ClassName DaemonMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 22:28
 * @Version 1.0
 */
public class DaemonMain {
    public static void main(String[] args){
        DaemonThread daemonThread = new DaemonThread();
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==3){
                daemonThread.setDaemon(true);
                daemonThread.start();
            }
        }
    }
}
