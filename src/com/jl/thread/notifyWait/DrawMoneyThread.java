package com.jl.thread.notifyWait;

/**
 * @ClassName DrawMoneyThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/22 14:49
 * @Version 1.0
 */
public class DrawMoneyThread extends Thread {
    private NWAccount nwAccount;
    private double amount;

    public DrawMoneyThread(String threadName,NWAccount nwAccount, double amount) {
        super(threadName);
        this.nwAccount = nwAccount;
        this.amount = amount;
    }

    public void run(){
        for(int i=0;i<=100;i++){
            nwAccount.draw(amount,i);
        }
    }
}
