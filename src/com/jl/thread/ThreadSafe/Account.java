package com.jl.thread.ThreadSafe;

/**
 * @ClassName NWAccount
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/18 9:20
 * @Version 1.0
 */
public class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
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
}
