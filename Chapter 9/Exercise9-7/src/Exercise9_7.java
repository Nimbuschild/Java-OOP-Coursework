
public class Exercise9_7 {
    public static void main(String[] args){
        Account account1 = new Account(1122, 20000,  .045);
        System.out.println("Balance: "  + account1.getBalance());
        System.out.println("Monthly Intersest: " + account1.getMonthlyInterest());
        System.out.println("Date" + account1.getDateCreated());

}}
