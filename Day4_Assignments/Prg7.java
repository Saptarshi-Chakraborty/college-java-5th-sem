/*
 * Write a java program that can exchange the value of two integers, two floats and two doubles (use the concept of method overloading)
 */

import java.util.*;

class Prg7 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        float c = 5.5f, d = 10.5f;
        double e = 5.5, f = 10.5;

        System.out.println("Before swapping: ");
        System.out.println("a: " + a + " b: " + b);
        System.out.println("c: " + c + " d: " + d);
        System.out.println("e: " + e + " f: " + f);

        swap(a, b);
        swap(c, d);
        swap(e, f);

        System.out.println("After swapping: ");
        System.out.println("a: " + a + " b: " + b);
        System.out.println("c: " + c + " d: " + d);
        System.out.println("e: " + e + " f: " + f);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
    }

    public static void swap(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
    }
}
