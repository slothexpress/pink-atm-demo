package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank theBank = new Bank();
        theBank.setupMockBank();
        ATM awesomeATM = new ATM();
        boolean cardInMachine = true;

        System.out.println("Enter account number: ");
        Scanner scan = new Scanner(System.in);
        int accountNumber = scan.nextInt();
        Account account = theBank.getAccount(accountNumber);

        while(cardInMachine)
        {
            awesomeATM.showMenu();
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    awesomeATM.checkBalance(account);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    int amount = scan.nextInt();
                    awesomeATM.withdrawMoney(account, amount);
                    break;

                case 3:
                    cardInMachine = false;
                    System.out.println("Byeeee :)");
                    break;
                default:
                    System.out.println("Invalid choice :(");
            }
        }
    }

}