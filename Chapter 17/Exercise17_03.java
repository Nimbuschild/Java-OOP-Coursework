// Sekou Hera

import java.io.*;


public class Exercise17_03 {
    public static void main(String[] args) throws IOException {

        File file = new File("Exercise17_03.dat");
        if (!file.exists() || true ){
            int i = 0;
            try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            int random = (int) (Math.random()*100);
            for (i = 0; i < random; i++){
            out.writeInt((int)(Math.random()*100));
}
}
            try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))){
                int sum = 0;
                int count = input.available() / 4;
                System.out.println(count);
                while (count > 0){
                sum += input.readInt();
                count--;
                }
                System.out.println("The sum of the integers is: " + sum);
            }


        }}}