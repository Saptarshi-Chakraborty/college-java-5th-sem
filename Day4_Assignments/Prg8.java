/*
 * Write a java program that overloads the area function and returns the area of square, rectangle.
 */

import java.util.*;

class Area {
    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }
}

public class Prg8 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of square with side 5: " + a.area(5));
        System.out.println("Area of rectangle with length 5, breadth 10: " + a.area(5, 10));
    }
}
