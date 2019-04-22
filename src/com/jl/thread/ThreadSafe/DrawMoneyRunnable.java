package com.jl.thread.ThreadSafe;

/**
 * @ClassName DrawMoneyRunnable
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/18 9:23
 * @Version 1.0
 */
public class DrawMoneyRunnable implements Runnable {
    private Account account;
    private double drawAmount;

    public DrawMoneyRunnable(Account account, double drawAmount) {
        super();
        this.account = account;
        this.drawAmount = drawAmount;
    }
    /*@Override
    public synchronized void run() {
        synchronized(account){
            if(account.getBalance() >= drawAmount){
                System.out.println("取钱成功， 取出钱数为：" + drawAmount);
                double balance = account.getBalance() - drawAmount;
                account.setBalance(balance);
                System.out.println("余额为：" + balance);
            }
        }

    }*/

    @Override
    public void run() {
        synchronized(account){
            if(account.getBalance() >= drawAmount){
                System.out.println("取钱成功， 取出钱数为：" + drawAmount);
                double balance = account.getBalance() - drawAmount;
                account.setBalance(balance);
                System.out.println("余额为：" + balance);
            }
        }

    }
}
