/*
Author: Sekou Hera
Date: 

Description: 
*/
import java.util.Comparator;

public class Exercise23_3 {
    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static <E extends Comparable<E>>
    void quickSort(E[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    public static <E extends Comparable<E>>
    int partition(E[] list, int first, int last) {
        E pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low].compareTo(pivot) <= 0)
                low++;

            while (low <= high && list[high].compareTo(pivot) > 0)
                high--;

            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high].compareTo(pivot) >= 0)
            high--;

        if (pivot.compareTo(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    public static <E> void quickSort(
            E[] list, int first, int last, Comparator<? super E> comparator) {
        if (last > first) {
            int pivotIndex = partition(list, first, last, comparator);
            quickSort(list, first, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, last, comparator);
        }
    }

    public static <E> int partition(
            E[] list, int first, int last, Comparator<? super E> comparator) {
        E pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && comparator.compare(list[low], pivot) <= 0)
                low++;


            while (low <= high && comparator.compare(list[high], pivot) > 0)
                high--;

            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && comparator.compare(list[high], pivot) >= 0)
            high--;

        if (comparator.compare(pivot, list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
    public static void main(String[] args) {

        GeometricObject[] Circle = {new Circle(2), new Circle(5.5),
                new Circle(3,12), new Circle(2, 5), new Circle(5),
                new Circle(4, 65), new Circle(6), new Circle(4, 1),
                new Circle(1), new Circle(14, 5)};
        quickSort(Circle, new GeometricObjectComparator());

        printList(Circle);
    }
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static void printList(GeometricObject[] list) {
        System.out.print("Sorted elements: ");
        for (GeometricObject e: list) {
            System.out.printf("%.2f ", e.getArea());
        }
        System.out.println();
    }
    public static class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
        public int compare(GeometricObject o1, GeometricObject o2) {
            double area1 = o1.getArea(); double area2 = o2.getArea();
            if (area1 < area2)
                return -1;
            else if (area1 == area2)
                return 0;
            else
                return 1;
        }
    }
    public static class Circle extends GeometricObject {
        private double radius;

        /**Default constructor
         * @param i */
        public Circle(int i) {
            this(1.0);
        }

        /**Construct circle with a specified radius*/
        public Circle(double radius) {
            this(radius, "white", false);
        }

        /**Construct a circle with specified radius, filled, and color*/
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public Circle(int i, int i1) {
        }

        /**Return radius*/
        public double getRadius() {
            return radius;
        }

        /**Set a new radius*/
        public void setRadius(double radius) {
            this.radius = radius;
        }

        /**Implement the getArea method defined in Exercise23_3.GeometricObject*/
        public double getArea() {
            return radius*radius*Math.PI;
        }

        /**Implement the getPerimeter method defined in Exercise23_3.GeometricObject*/
        public double getPerimeter() {
            return 2*radius*Math.PI;
        }

        /**Override the equals() method defined in the Object class*/
        public boolean equals(Circle circle) {
            return this.radius == circle.getRadius();
        }

        @Override
        public String toString() {
            return "[Exercise_23_03.Circle] radius = " + radius;
        }
    }

    // Exercise23_3.GeometricObject.java: The abstract Exercise23_3.GeometricObject class
    public abstract static class GeometricObject {
        private String color = "white";
        private boolean filled;

        /**Default construct*/
        protected GeometricObject() {
        }

        /**Construct a geometric object*/
        protected GeometricObject(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        /**Getter method for color*/
        public String getColor() {
            return color;
        }

        /**Setter method for color*/
        public void setColor(String color) {
            this.color = color;
        }

        /**Getter method for filled. Since filled is boolean,
         so, the get method name is isFilled*/
        public boolean isFilled() {
            return filled;
        }

        /**Setter method for filled*/
        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        /**Abstract method findArea*/
        public abstract double getArea();

        /**Abstract method getPerimeter*/
        public abstract double getPerimeter();
    }
}