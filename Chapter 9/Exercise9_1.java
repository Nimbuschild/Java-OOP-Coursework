
public class Exercise9_1{

public static void main(String[] args){

    Rectangle Rectangle1 = new Rectangle(4, 40);
    System.out.println("The area of rectangle1 with width " +
        Rectangle1.width + " and height " +
        Rectangle1.height + " is " +
        Rectangle1.getArea());
    System.out.println("The perimeter of rectangle1 is " +
        Rectangle1.getPerimeter());
        Rectangle Rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("The area of rectangle2 with width " +
         Rectangle2.width + " and height " +
         Rectangle2.height + " is " +
         Rectangle2.getArea());
        System.out.println("The perimeter of rectangle2 is " +
         Rectangle2.getPerimeter());
}
}
class Rectangle {
    double width = 1;
    double height = 1;
    public Rectangle(){
}
public Rectangle(double newWidth, double newHeight){
    width = newWidth;
    height = newHeight;
}
public double getArea(){
    return width * height;
}
public double getPerimeter(){
    return 2 * (width + height);
    }
}
