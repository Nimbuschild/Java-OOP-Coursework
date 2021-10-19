import java.util.Date;

class Account {
    private int ID = 0;
    private double Balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account(int iD, double balance, double annualInterestRate) {
        this.ID = iD;
        this.Balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return Balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setBalance(double balance) {
        Balance = balance;
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


}
