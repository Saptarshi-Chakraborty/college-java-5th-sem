// Write a java program to display the sum of all command line arguments.

import java.lang.System;
import java.lang.String;
import java.lang.Integer;

class Program4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide atleast 2 argument.");
            return;
        }

        System.out.print("Sum of");
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            System.out.print(args[i] + " + ");
        }
        System.out.println("\b\b  = " + sum);
    }
}

/*
 * Output:
 * 
 * $ javac Program4.java
 * $ java Program4 12 23 34 45 56
 * Sum of 12 + 23 + 34 + 45 + 56  = 170
 * 
 */