/*
 * Write a java program that overloads the product function that can multiply two integers / one integer and one float / one double and one long.
 */

import java.util.*;

class Product {
    int product(int a, int b) {
        return a * b;
    }

    float product(int a, float b) {
        return a * b;
    }

    double product(double a, long b) {
        return a * b;
    }
}

public class Prg6 {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product of 5 and 10: " + p.product(5, 10));
        System.out.println("Product of 5 and 10.5: " + p.product(5, 10.5f));
        System.out.println("Product of 5.5 and 10: " + p.product(5.5, 10));
    }
}
