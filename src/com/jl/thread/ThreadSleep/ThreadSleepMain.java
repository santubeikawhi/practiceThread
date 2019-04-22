package com.jl.thread.ThreadSleep;

/**
 * @ClassName ThreadSleepMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 9:18
 * @Version 1.0
 */
public class ThreadSleepMain {
    public static void main(String[] args){
        Thread threadb = new Thread(new SleepRunnableB());
        Thread threada = new Thread(new SleepRunnableA(threadb));
        for(int i=0;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==10){
                threada.start();
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
