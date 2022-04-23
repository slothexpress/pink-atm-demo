package com.company;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> allAccounts = new ArrayList<Account>();

    public void addAccount(Account account)
    {
        this.allAccounts.add(account);
    }

    public Account getAccount(int accountNumber)
    {
        for (Account account:allAccounts)
        {
            if(account.getAccountNumber() == accountNumber)
            {
                return account;
            }
        }
        return null;
    }

    public void setupMockBank() {
        Account myAccount = new Account(1122, 1000);
        Account yourAccount = new Account(3344, 5000);
        allAccounts.add(myAccount);
        allAccounts.add(yourAccount);
    }

}