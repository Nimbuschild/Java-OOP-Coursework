// Sekou Hera

import java.util.Scanner;
import java.io.*;
public class Exercise17_14 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
        String fileInPath = input.next().trim();
        System.out.println("Enter a file name: " + fileInPath);
        FileInputStream in = null;
        try {
            File fileIn = new File(fileInPath);
            if (fileIn != null && fileIn.canRead())
            {
                in = new FileInputStream(fileIn);
            } else{
                System.out.println("Could not open file " + fileInPath);}
        }
        catch (FileNotFoundException e){
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e){}}}}}
