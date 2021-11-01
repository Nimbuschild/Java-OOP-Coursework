// Sekou Hera

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {
        File newfile = new File("Exercise12_15.txt");
        if (newfile.exists()) {
        }
        try (PrintWriter output = new PrintWriter(newfile)) {

            for (int i = 0; i < 100; i++) {
                output.print(((int) (Math.random() * 100)));
                output.print(" ");
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner input = new Scanner(newfile)) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        sort(list);
        System.out.print(list.toString());
    }
}