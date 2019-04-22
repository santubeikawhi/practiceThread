package com.jl.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 23:17
 * @Version 1.0
 */
public class CallableMain {
    public static void main(String[] args){
        try {
            MyCallable callableMain =  new MyCallable();
            FutureTask<Integer> futureTask = new FutureTask<Integer>(callableMain);
            for(int i=0;i<=12;i++){
                System.out.println(Thread.currentThread().getName() + " "+i);
                if(i==10){
                    Thread t = new Thread(futureTask);
                    t.start();
                }
            }
            System.out.println("主线程for循环执行完毕..");
            int sum = futureTask.get();
            System.out.println("sum="+sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
