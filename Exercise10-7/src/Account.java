import java.util.Date;

class Account {
    private int ID;
    private double Balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    Account(int ID,double Balance){
      this.ID = ID;
      this.Balance = Balance;
      this.dateCreated = new java.util.Date();
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return Balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setBalance(double newbalance) {
        Balance = newbalance;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
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


    public void withDraw(double withdrawAmount) {
        Balance = Balance - withdrawAmount;
    }
}




