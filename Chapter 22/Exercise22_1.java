// Sekou Hera

// The runtime is O(n) a Linear time Algorithm because the program runs once

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise22_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                        list.clear();
            }

        list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            } }

        for (Character ch: max) {
            System.out.print(ch);
     }

        System.out.println("Is the Maximum consecutive substring.");
    }}

