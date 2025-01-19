/*
 * Create a class named BankAcc having two member variables name and balance. Use relevant method to take input for the data members. Write two other member functions for the purpose of deposit and withdrawal. Also check at the time of withdrawal whether the withdrawal amount is less than the bank balance and if it is then print “insufficient balance”.
 */

import java.util.Scanner;

class BankAcc {
    String name;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the account holder: ");
        name = sc.nextLine();
        System.out.println("Enter the balance of the account holder: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        }
    }
}

public class Prg3 {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.input();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(1000);
    }
}


