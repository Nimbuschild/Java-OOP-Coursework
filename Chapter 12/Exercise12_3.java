// Sekou Hera

import java.util.Scanner;

public class Exercise12_3 {

    public static void main(String[] args){

        int[] RandomArray = new int[100];
        for (int i = 0; i < RandomArray.length; i++){
            RandomArray[i] = (int) (Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Index of the array: ");
        try {
            int IndexofArray = input.nextInt();

            System.out.println("The corresponding element value is: " + IndexofArray + RandomArray[IndexofArray]);

        } catch (IndexOutOfBoundsException ex){

            System.out.println("OUT OF BOUNDS");


        }
    }
}