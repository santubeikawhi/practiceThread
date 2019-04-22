package com.jl.thread.notifyWait;

/**
 * @ClassName NotifyWaitMain
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/22 15:27
 * @Version 1.0
 */
public class NotifyWaitMain {
    public static void main(String[] args){
        NWAccount nwAccount =new NWAccount("qweqwe",0);
        Thread drawMoneyThread = new DrawMoneyThread("drawMoneyThread",nwAccount,700);
        Thread depositeMoneyThread = new DepositeMoneyThread("depositeMoneyThread ",nwAccount,700);

        depositeMoneyThread.start();
        drawMoneyThread.start();
    }
}
