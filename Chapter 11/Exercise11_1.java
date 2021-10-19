// Sekou Hera

import java.util.Scanner;

public class Exercise11_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of the Triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            System.out.println("Enter a Triangle color: ");
            String color = input.next();

            System.out.println("Is the Triangle filled?: ");
            boolean fill = input.nextBoolean();

            Triangle triangle = new Triangle(side1,side2,side3);
            triangle.getColor(color);
            triangle.isFilled(fill);

        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
        System.out.println("Color of Triangle: " + triangle.getColor());
        System.out.println("Is Triangle Color Filled?: " + triangle.isFilled());

    }

    public static class Triangle extends GeometricObject {
        double side1;
        double side2;
        double side3;

        Triangle(){
            side1 = side2 = side3 = 1.0;
        }
    Triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return area;
        }
        public double getPerimeter(){
            return(side1 + side2 + side3);
        }
        public String toString(){
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }
    }

    public static class  GeometricObject {
         String color = "BLUE";
         boolean filled;
         java.util.Date dateCreated;


        public GeometricObject() {
            dateCreated = new java.util.Date();
        }

        public GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor(String color) {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled(boolean filled) {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }


    }
    }

