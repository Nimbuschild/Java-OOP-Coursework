// Sekou Hera

import java.util.Date;

public class Exercise11_3 {
    public static void main(String[] args) {

        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Monthly Intersest: " + account1.getMonthlyInterest());
        System.out.println("Date" + account1.getDateCreated());
    }

    public class CheckingAccount extends Account {

        double overdraftLimit = 0;


        public CheckingAccount(int id, double balance, double overdraftLimit) {
            super(id, balance);
            this.overdraftLimit = overdraftLimit;
        }

        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public void withdraw(double amount) {
            if (getBalance() - amount > overdraftLimit) {
                setBalance(getBalance() - amount);
            } else
                System.out.println("Overdraft Limit!");
        }


        public String toString() {
            return super.toString() + "\nOverdraft limit: $" +
                    String.format("%.2f", overdraftLimit);
        }
    }

    class SavingsAccount extends Account {
        public SavingsAccount() {
            super();
        }

        public SavingsAccount(int ID, double balance) {
            super(ID, balance);
        }

        public void withdraw(double amount) {
            if (amount < getBalance()) {
                setBalance(getBalance() - amount);
            } else
                System.out.println("Account Overdrawn!");
        }
    }

    static class Account {
        private int ID;
        private double Balance;
        private double annualInterestRate;
        private java.util.Date dateCreated;


        public Account(int ID, double balance) {
            this.ID = ID;
            this.Balance = balance;
            this.annualInterestRate = annualInterestRate;
            dateCreated = new Date();
        }

        public Account() {

        }

        public double getBalance() {
            return Balance;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setBalance(double balance) {
            this.Balance = balance;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public double getMonthlyInterest() {
            return annualInterestRate / 12;
        }

        public void withdraw(double amount) {
            Balance = Balance - amount;
        }

        public void deposit(double deposit) {
            Balance = Balance + deposit;
        }
        public String toString() {
            return "\nAccount ID: " + ID + "\nDate created: " + getDateCreated()
                    + "\nBalance: $" + String.format("%.2f", Balance) +
                    "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());

    }
}}


