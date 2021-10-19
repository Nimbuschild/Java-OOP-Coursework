// Sekou Hera
import java.util.Scanner;

public class Exercise9_7 {
    public static void main(String[] args) {
        Account[] account = new Account[10];
        account[0] = new Account(0, 100);
        account[1] = new Account(1, 100);
        account[2] = new Account(2, 100);
        account[3] = new Account(3, 100);
        account[4] = new Account(4, 100);
        account[5] = new Account(5, 100);
        account[6] = new Account(6, 100);
        account[7] = new Account(7, 100);
        account[8] = new Account(8, 100);
        account[9] = new Account(9, 100);
            for (int i = 0; i < 9; i++) {
            account[i] = new Account(i, 100.0);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ID: ");
            int ID = input.nextInt();
            do {
            if (ID <= 9 && ID >= 0 && ID == account[ID].getID()) {
                System.out.println("Main Menu: ");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                do {
                    System.out.print("Enter a choice: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("The balance is: " + account[ID].getBalance());
                            break;
                        case 2:
                            System.out.print("Enter withdraw amount: ");
                            double withdrawAmount = input.nextInt();
                            account[ID].withDraw(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter deposit amount: ");
                            int depositAmount = input.nextInt();
                            account[ID].deposit(depositAmount);
                            break;
                        case 4:
                            System.out.println("Exit");
                            System.out.println("Enter an ID");
                            break;
                    }
                } while (true);
            }
        } while (true);
    }
}


