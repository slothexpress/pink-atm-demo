package com.company;

public class Account {
    private int accountNumber;
    private String name;
    private int balance;

    public Account(int accountNum, int bal) {
        this.accountNumber = accountNum;
        this.balance = bal;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void setBalance(int bal)
    {
        this.balance = bal;
    }

}