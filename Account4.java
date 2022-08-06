/* 21CE052 Harshal Karangale
Subclasses  of  Account)  In  Programming  Exercise  2,  the  Account  class  wasdefined to model a bank account. An account has the properties account number,
balance,  annual  interestrate,  and  date  created,  and  methods  to  deposit  and withdrawfunds.  Create  two  subclasses  for  checking  and  saving  accounts. 
A checkingaccount  has  an  overdraft  limit,  but  a  savings  account  cannot  be overdrawn.Draw  the  UML  diagram  for  the  classes  and  then implement  them. 
Writea  test  program  that  creates  objects  of  Account,  SavingsAccount,  andCheckingAccount and invokes their toString() methods.*/

import java.util.Scanner;
import java.util.Date;

public class Account4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // creating objects of the three classes
        CheckingAccount c = new CheckingAccount(1, 150);
        SavingAccount s = new SavingAccount(2, 450);
        // trying the methods of child class
        System.out.println("Saving Account - ");
        s.withdrawSa(200);
        s.getter();
        System.out.println();
        System.out.println("Checking Account - ");
        c.check(300);
        c.getter();
        sc.close();
    }
}

class Account {
    // private data members
    private int id;
    double balance;
    private double annualInterestRate;
    private Date dateCreated;
    static int cnt = 0;

    // default constructor
    public Account() {
        id = 0;
        balance = 500;
        annualInterestRate = 7;
    }

    // parameterised constructor
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // getter method
    public void getter() {
        System.out.println("Id : " + id);
        System.out.println("Balance : " + balance);
    }

    public Date getDate() {
        return dateCreated;
    }

    // setter method
    public void setter(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    double getMonthlyInterestRate() {
        double mit = annualInterestRate / 12;
        return mit;
    }

    double getMonthlyInterest() {
        double mi = balance * annualInterestRate / 12;
        return mi;
    }

    // method to withdraw money
    void withdraw(double x) {
        if (balance >= x) {
            balance -= x;
            System.out.println("Amout " + x + " Withdrawn - Balance is : " +
                    balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }// method to deposite money

    void deposit(double x) {
        balance += x;
        System.out.println("Amout " + x + " Deposited - Balance is : " +
                balance);
    }
}

// class CheckingAccount child of Account
class CheckingAccount extends Account {
    private double OverDraft = -100;

    public CheckingAccount(int newid, double newbalance) {
        super(newid, newbalance);
    }

    // check if amount can be withdrawn after overdraft
    public void check(double amt) {
        if (balance - amt < OverDraft) {
            System.out.println("Failure");
        } else {
            balance -= amt;
        }
    }
}

// class SavingAccount child of Account
class SavingAccount extends Account {
    private double OverDraftLimit = 0;

    public SavingAccount(int newid, double newbalance) {
        super(newid, newbalance);
    }

    // withdraw funds if available
    public void withdrawSa(double amt) {
        if (balance - amt < OverDraftLimit) {
            System.out.println("Failure - Insufficient funds");
        } else {
            balance -= amt;
        }
    }
}