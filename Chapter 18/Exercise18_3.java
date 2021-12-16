// Sekou Hera

import java.util.Scanner;

public class Exercise18_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int A = Integer.parseInt(input.next());
        int B = Integer.parseInt(input.next());
        System.out.println("The GCD of " + A + " and " + B
                + " is " + gcd(A, B));
    }
    private static int gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}