package com.jl.thread.ThreadSafe;

/**
 * @ClassName ThreadSafeMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/18 9:26
 * @Version 1.0
 */
public class ThreadSafeMain {
    public static void main(String[] args){
        Account account = new Account("123456", 1000);
        DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 700);
        Thread myThread1 = new Thread(drawMoneyRunnable);
        Thread myThread2 = new Thread(drawMoneyRunnable);
        myThread1.start();
        myThread2.start();
    }
}
