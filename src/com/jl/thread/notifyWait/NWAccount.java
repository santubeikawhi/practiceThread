package com.jl.thread.notifyWait;

/**
 * @ClassName NWAccount
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/22 14:50
 * @Version 1.0
 */
public class NWAccount {
    private String accountNo;
    private double balance;
    private boolean flag = false;//标识账户中是否已有存款

    public NWAccount() {
    }

    public NWAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //存钱
    public synchronized  void deposite(double depositeAmount,int i){
        if(flag){// 账户中已有人存钱进去，此时当前线程需要等待阻塞
            try {
                System.out.println(Thread.currentThread().getName()+"开始执行wait操作 -- i="+i);
                wait();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            //开始存钱
            System.out.println(Thread.currentThread().getName()+"存钱："+depositeAmount+" -- i="+i);
            setBalance(balance+depositeAmount);
            flag = true;
            notifyAll();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-- 存钱 -- 执行完毕 -- i="+i);
        }
    }

    public synchronized  void draw(double drawAmount,int i){
        if(!flag){
            // 账户中还没人存钱进去，此时当前线程需要等待阻塞
            try {
                System.out.println(Thread.currentThread().getName()+"开始执行wait操作 --i="+i);
                wait();
                System.out.println(Thread.currentThread().getName()+"执行了wait操作 --i="+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            //开始取钱
            System.out.println(Thread.currentThread().getName()+" 取钱:"+drawAmount+" --i="+i);
            setBalance(balance-drawAmount);
            flag = false;
            notifyAll();
            System.out.println(Thread.currentThread().getName()+"-- 取钱完毕 -- i="+i);
        }
    }
}
