// Write a java program to print all command line arguments.

import java.lang.System;
import java.lang.String;

class Program2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide atleast 1 argument.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

/*
 * Output:
 * 
 * $ javac Program2.java
 * $ java Program2 Hello 34 World
 * Hello
 * 34
 * World
 * 
 */
