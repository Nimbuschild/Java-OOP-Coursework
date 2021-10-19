class MyInteger{
    public int value;

    public MyInteger(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return (value % 2 == 0);
    }
    public boolean isOdd(){
        return (value % 2 != 0);
    }
    public boolean isPrime(){
        if (value == 2)
        return true;
        for (int i = 2; i * i <= value; i++) {
        if (value % i == 0)
        return false;
    }
        return true;
    }
    public static boolean isEven(int value){
        if (value % 2 == 0)
        return true;
        else
        return false;
    }
    public static boolean isOdd(int value){
        if (value % 2 != 0)
        return true;
        else
        return false;
    }
    public static boolean isPrime(int value) {
        if (value == 2) return true;
        for (int i = 2; i * i <= value; i++) ;

           return false;
    }

    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven(myInteger.getValue());
    }
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd(myInteger.getValue());
    }
    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.getValue();
    }
    public static int parseInt(char[] value){
        int number = 0;
        for(int i=0; i<value.length; i++)
        number = 10*number + (int)(value[i]-'0');
        return number;
    }
     public static int parseInt(String value){
        return Integer.parseInt(value);

 }}