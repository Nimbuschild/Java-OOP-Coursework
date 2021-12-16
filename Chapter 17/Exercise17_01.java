//Sekou Hera

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Exercise17_01 {
    public static void main(String[] args){
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("Exercise17_01.txt", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++);
        System.out.print((int)(Math.random()*100) + " ");

}
    }


