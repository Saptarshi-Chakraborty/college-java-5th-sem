// Write a java program to print first two command line arguments.

import java.lang.System;
import java.lang.String;

class Program1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide atleast 2 arguments.");
            return;
        }
        System.out.println("First argument: " + args[0]);
        System.out.println("Second argument: " + args[1]);
    }
}

/*
 * Output:
 * 
 * $ javac Program1.java
 * $ java Program1 Hello 34 World
 * First argument: Hello
 * Second argument: 34
 * 
 */