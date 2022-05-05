package com.company;

public class ATM {

    public void showMenu() {
        System.out.println("\nWhat would you like to do?" +
                "\n1. Check balance" +
                "\n2. Withdraw money" +
                "\n3. Retrieve card\n");
    }

    public int checkBalance(Account account) {
        System.out.println("\nYour account balance: " + account.getBalance() + " SEK.\n");
        return account.getBalance();
    }

    public void withdrawMoney(Account account, int amount) {
        if(account.getBalance() < amount) {
            System.out.println("\nInsufficient amount available in your account.\n");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("\nSuccessful withdrawal: " + amount + " SEK.\n");
        }
    }
}