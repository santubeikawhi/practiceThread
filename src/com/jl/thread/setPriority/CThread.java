package com.jl.thread.setPriority;

/**
 * @ClassName CThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/17 10:00
 * @Version 1.0
 */
public class CThread extends Thread {
    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"CThread:"+i);
            if(i==2){
                Thread.yield();
            }
        }
    }
}
