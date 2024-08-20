package Chapter9ObjectsAndClasses;

import java.util.Date;

public class Account {
    int id;
    double balance;

    double annualInterestRate;

    Date dateCreated;



    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    public Account(int id,double initialBalance){
        this.id=id;
        this.balance=initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }

    }
    public void deposit(double amount) {
        balance += amount;
    }

}
