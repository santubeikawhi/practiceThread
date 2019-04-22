package com.jl.thread.create;

/**
 * @ClassName ThreadMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 8:48
 * @Version 1.0
 */
public class ThreadMain {
    public static void main(String[] args){
            for(int i=0;i<=12;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                if(i == 10){
                    MyThread m1 = new MyThread(); // 创建一个新的线程 m1  此线程进入新建状态
                    MyThread m2 = new MyThread(); // 创建一个新的线程 m2 此线程进入新建状态
                    m1.start(); //调用start()方法 此线程进入就绪状态
                    m2.start(); //调用start()方法 此线程进入就绪状态
//                    Thread.sleep(100);
                }

            }
    }
}
