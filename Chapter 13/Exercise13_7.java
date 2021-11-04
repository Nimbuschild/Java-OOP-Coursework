import java.util.Date;

public class Exercise13_7 {
    public static void main(String[] args) {
        GeometricObject[] triangle = {new Triangle(22, 21, 23), new Triangle(14, 15, 16), new Triangle(7, 8, 9), new Triangle(12, 11, 13), new Triangle(10, 9, 8)};
        int i;
        for (i = 0; i < triangle.length; i++){
            System.out.println("\nTriangle #" + (i + 1));
            System.out.println("The Area is: " + triangle[i].getArea());
            System.out.println("How to color: " + ((Triangle) triangle[i]).howToColor());
        }

    }

    public static abstract class GeometricObject {
        private String color = ("red" + "white" + "blue");
        private boolean filled;
        private Date dateCreated;

        GeometricObject(){
            dateCreated = new Date();
        }

        GeometricObject(String color, boolean filled) {
            dateCreated = new Date();
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

        public Date getDateCreated() {
            return dateCreated;
        }
        public String toString(){
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

        public abstract double getArea();



        public abstract double getPerimter();
    }


    public static class Triangle extends GeometricObject implements Colorable{
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

        @Override
        public String howToColor() {
            return null;
        }
    }

    public static interface Colorable {

        String howToColor();
    }
}




