package com.jl.thread.setPriority;

/**
 * @ClassName SetPriorityMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/17 10:09
 * @Version 1.0
 */
public class SetPriorityMain {
    public static void main(String[] args){
        CThread cThread = new CThread();
        BThread bThread = new BThread(cThread);
        AThread aThread = new AThread(bThread);
        for(int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i ==6){
                aThread.setPriority(1);
                aThread.start();
            }
        }
    }
}
