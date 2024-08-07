// Write a java program to count the command line arguments which are less than 100.

import java.lang.System;
import java.lang.String;
import java.lang.Integer;

class Program5 {
    public static void main(String[] args) {
        int count = 0;

        System.out.print("Arguments less than 100: ");
        for (int i = 0; i < args.length; i++) {
            
            if (Integer.parseInt(args[i]) < 100) {
                System.out.print(args[i]);

                if (i != args.length - 1)
                    System.out.print(", ");

                count++;
            }
        }
        System.out.println("\nCount of numbers less than 100 = " + count);
    }
}

/*
 * Output:
 * 
 * $ javac Program5.java
 * $ java Program5 10 20 30 40 50 60 70 80 90 100 110 120 130 140 150
 * Arguments less than 100: 10, 20, 30, 40, 50, 60, 70, 80, 90
 * Count of numbers less than 100 = 9
 * 
 */