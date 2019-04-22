package com.jl.thread.callable;

import java.util.concurrent.Callable;

/**
 * @ClassName MyCallable
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 23:15
 * @Version 1.0
 */
public class MyCallable implements Callable<Integer> {
    private int i = 0;

    /**
     * Callable接口中，使用Call方法作为线程的执行体，同时还具有返回值，
     * 在创建新的线程时，用FutureTask来包装MyCallable对象，同时作为
     * Thread对象的target
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum =0;
        for(;i<100;i++){
            sum+=i;
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return sum;
    }
}
