//Sekou Hera

import java.util.Date;

public class Exercise13_11 {
    public static void main(String[] args){
        Octagon octagon1 = new Octagon();
        Octagon octagon2 = (Octagon)octagon1.clone();
        System.out.println("compareTo: " + (octagon1.compareTo(octagon2) == 0));
        System.out.println("equals: " + octagon1.equals(octagon2));
    }


    public abstract static class GeometricObject {
        private String color = ("red" + "white" + "blue");
        private boolean filled;
        private Date dateCreated;

        GeometricObject() {
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

        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

        public abstract double getArea();


        public abstract double getPerimeter();
    }
}

    class Octagon extends Exercise13_11.GeometricObject implements Cloneable {
        double side;
        public Octagon(){
        }
        public Octagon(double side) {
            this.side = side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public double getArea() {
            return (2 + (4 / (Math.sqrt(2))) * side * side);
        }

        @Override

        public double getPerimeter() {
            return side * 8;
        }

        public String toString() {
            return "Area: " + getArea() + "\nPerimeter: "
                    + getPerimeter() + "\nClone Compare: " +  "\nFirst Compare: ";
        }

        public int compareTo(Octagon octagon) {
            if(getArea() > octagon.getArea())
                return 1;
            else if(getArea() < octagon.getArea())
                return -1;
            else
                return 0;
        }

        @Override
        public Octagon clone() {
            return new Octagon(this.side);
        }
        
    }







