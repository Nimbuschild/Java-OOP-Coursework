// Sekou Hera
// The runtime is O(n), a Linear Algorithm

import java.util.Scanner;

public class Exercise22_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string s1: ");
            String s1 = input.next();
        System.out.println("Enter a string s2: ");
            String s2 = input.next();
        if (isSubstring(s1, s2)) {
            System.out.println("The first string is a substring of the second.");
        }
    }
    public static boolean isSubstring(String string1, String string2) {
        boolean match = true;
            char a;
            char b;
        for (int i = 0; i < string1.length(); i++) {
            a = string1.charAt(i);
            for (int j = 0; i < string2.length(); i++) {
                b = string2.charAt(i);
                if (a == b) {
                    match = true;
                } else {
                    match = false;
                }
            }
        }
        return match;
    }
}







