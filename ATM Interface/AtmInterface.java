/*
 * Aim: This is the code for the ATM Interface
 * Author: Gohel Neel
 * B.Tech. CSE Student At Darshan University
 * Rajkot, Gujrat, India
 * Date: 21-08-2024
 * 
 */


import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Error: Invalid deposit amount.");
        }
    }

    private void checkBalance() {
        double balance = account.checkBalance();
        System.out.println("Your current balance is $" + balance + ".");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Please choose an option (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Have a great day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000);

        // Create an ATM linked to the bank account
        ATM atm = new ATM(account);

        // Run the ATM
        atm.run();
    }
}