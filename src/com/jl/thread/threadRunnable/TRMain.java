package com.jl.thread.threadRunnable;

/**
 * @ClassName TRMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/9 21:45
 * @Version 1.0
 */
public class TRMain {
    public static void main(String[] args){
        for(int i=0;i<=12;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==12){
                TRRunnable trRunnable = new TRRunnable();
                TRThread trThread = new TRThread(trRunnable);
                /**
                 * 当执行到Thread()类的run()方法时，会首先判断target是否存在，
                 * 存在则执行target中的run()方法，也就是实现Runnable接口并
                 * 重写了run()方法的类中的run()方法。但上述给到的例子中，由于
                 * 多态的存在，根本没有执行到父类Thread中的run()方法，
                 * 直接执行了TRThread 中重写的run()方法
                 */
                trThread.start();
            }
        }

    }
}
