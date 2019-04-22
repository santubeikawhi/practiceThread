package com.jl.thread.ThreadJoin;

/**
 * @ClassName ThreadJoinMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/16 9:01
 * @Version 1.0
 */
public class ThreadJoinMain {
    public static void main(String[] args){
        Thread threada = new Thread(new MyRunnableB());
        Thread threadb = new Thread(new MyRunnableA(threada));
        for(int i =0;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==10){
                threadb.start();
                try {
                    threadb.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
