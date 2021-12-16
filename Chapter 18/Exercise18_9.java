// Sekou Hera

import java.util.Scanner;

public class Exercise18_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);
    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            System.out.println(value);
        else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}