package com.jl.thread.notifyWait;

/**
 * @ClassName DepositeMoneyThread
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/22 15:23
 * @Version 1.0
 */
public class DepositeMoneyThread extends Thread {
    private NWAccount nwAccount;
    private double amount;

    public DepositeMoneyThread(String threadName, NWAccount nwAccount, double amount) {
        super(threadName);
        this.nwAccount = nwAccount;
        this.amount = amount;
    }

    public void run(){
        for(int i=0;i<=100;i++){
            nwAccount.deposite(amount,i);
        }
    }
}
