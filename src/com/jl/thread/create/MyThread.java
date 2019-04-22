package com.jl.thread.create;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 8:45
 * @Version 1.0
 */
public class MyThread extends Thread {
    private int i = 0;

    public void run(){
        for( i=0;i<=10;i++){
            System.out.println(this.getName()+" "+i);
        }
    }
}
