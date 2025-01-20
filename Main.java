import java.util.LinkedList;
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

public class Main {

    public static void main(String[] args) {
        // Car c1 = new Car();

        Bike b1 = new Bike();

        System.out.println("This is main method");
    }

    static {
        System.out.println("This is Only static block");
    }
}
