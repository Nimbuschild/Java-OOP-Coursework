// Sekou Hera
import java.util.Scanner;

public class Exercise13_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 Sides of the Exercise13_1.Triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
        System.out.print("Enter a color for Exercise13_1.Triangle: ");
            String color = input.next();
        System.out.print("Is the Exercise13_1.Triangle filled? ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1,side2,side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println("The Triangles Area is: " + triangle.getArea());
            System.out.println("The Triangles Perimeter is: " + triangle.getPerimter());
            System.out.println("The Triangles Color is: " + triangle.getColor());
            System.out.println("Is the Exercise13_1.Triangle filled? " + triangle.isFilled());







    }

    public abstract static class GeometricObject {
        private String color = ("red" + "white" + "blue");
        private boolean filled;
        private java.util.Date dateCreated;

        GeometricObject(){
            dateCreated = new java.util.Date();
        }

        GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
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

        public java.util.Date getDateCreated() {
            return dateCreated;
        }
        public String toString(){
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

        public abstract double getArea();



        public abstract double getPerimter();


    }

    public static class Triangle extends GeometricObject {
        double side1;
        double side2;
        double side3;

        public Triangle() {
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double getSide3() {
            return side3;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }

        @Override
        public double getArea() {
            double area,s;
            s = side1 + side2 + side3;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return(area);
        }
        @Override
        public double getPerimter() {
            return side1 + side2 + side3;
        }

    }
}
