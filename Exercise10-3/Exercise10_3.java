public class Exercise10_3 {
    public static void main(String[] args){
        MyInteger int1 = new MyInteger(21);

    System.out.println("int1 is " + int1.getValue());
    System.out.println("int1 is Even? " + int1.isEven());
    System.out.println("int1 is Odd? " + int1.isOdd());
    System.out.println("int1 is Prime? " + int1.isPrime());
    System.out.println("22 is prime? " + MyInteger.isPrime(22));
    char[] chars = {'2', '4', '6', '8',};
    System.out.println(MyInteger.parseInt(chars));
     String s = "2468";
    System.out.println(MyInteger.parseInt(s));
        MyInteger int2 = new MyInteger(19);
        System.out.println("int2 is " + int2.getValue());
        System.out.println("int 2 Odd? " + int2.isOdd());
      System.out.println("54 is Odd? " + MyInteger.isOdd(54));
    System.out.println("int1 is equal to int2? " + int1.equals(int2));
 System.out.println("int1 is equal to 21? " + int1.equals(21));

    }}

