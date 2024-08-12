// Write a java program that reads a number N and a Word from command line input, then prints the word N times, one word per line.

import java.lang.System;
import java.lang.String;
import java.lang.Integer;

class Program6 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("\nPlease provide atleast 2 arguments.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        String word = args[1];

        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}

/*
 * Output:
 * 
 * $ javac Program6.java
 * $ java Program6 7 Universe
 * Universe
 * Universe
 * Universe
 * Universe
 * Universe
 * Universe
 * Universe
  * 
 */
