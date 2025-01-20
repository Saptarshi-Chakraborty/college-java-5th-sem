/*Write a java program that contains a zero-arg constructor, one static block and two instance blocks and creates an object and show the execution sequence of this code. */

import java.util.*;

class Car {
    int price;
    static {
        System.out.println("This is static block inside car");
    }

    Car() {
        System.out.println("This is constructor of car");
    }
}

class Bike extends Car {
    int price;

    Bike() {
        super(); // Correct way to call the superclass constructor
        System.out.println("This is constructor of bike");
    }
}

public class Prg1 {

    public static void main(String[] args) {
        // Car c1 = new Car();

        Bike b1 = new Bike();

        System.out.println("This is main method");
    }

    static {
        System.out.println("This is Only static block");
    }

}
