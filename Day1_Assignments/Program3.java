// Write a java program to sum of two integer numbers. The input numbers are taken as command line arguments. If exactly two numbers are not provided, then an appropriate error message is displayed.

import java.lang.System;
import java.lang.String;
import java.lang.Integer;

class Program3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly 2 numbers as arguments.");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum of " + num1 + " and " + num2 + " is = " + (num1 + num2));
    }
}

/*
 * Output 1:
 * 
 * $ javac Program3.java
 * $ java Program3 10
 * Please provide exactly 2 numbers as arguments.
 * 
 * 
 * Output 2:
 * 
 * $ javac Program3.java
 * $ java Program3 10 20
 * Sum of 10 and 20 is = 30
 * 
 */