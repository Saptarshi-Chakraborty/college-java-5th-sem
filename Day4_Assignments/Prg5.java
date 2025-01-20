/*
 * 5. Write a java program that overloads the volume function that returns the volume of square box and rectangular box.
 */

import java.util.*;

class Box {
    int volume(int side) {
        return side * side * side;
    }

    int volume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}

public class Prg5 {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Volume of square box with side 5: " + b.volume(5));
        System.out.println("Volume of rectangular box with length 5, breadth 10, height 15: " + b.volume(5, 10, 15));
    }
}
