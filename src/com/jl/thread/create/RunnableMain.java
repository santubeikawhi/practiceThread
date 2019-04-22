package com.jl.thread.create;

/**
 * @ClassName RunnableMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 9:07
 * @Version 1.0
 */
public class RunnableMain {
    public static void main(String[] args){
        for(int i=0;i<=12;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
            if(i == 10){
                MyRunnable myRunnable = new MyRunnable();// 创建一个Runnable实现类的对象
                Thread t1 = new Thread(myRunnable);// 将myRunnable作为Thread target创建新的线程
                Thread t2 = new Thread(myRunnable);
                t1.start();// 调用start()方法使得线程进入就绪状态
                t2.start();
            }

        }
    }
}
