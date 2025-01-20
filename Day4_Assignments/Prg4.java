/*
 * 4. Write a java program that reads an integer or a float number and returns the absolute
value of that given input number. (use the concept of method overloading)
 */

import java.lang.System;
import java.lang.Integer;
import java.lang.Float;

class Prg4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("\nPlease provide atleast 1 argument.");
            return;
        }

        if (args[0].contains(".")) {
            float f = Float.parseFloat(args[0]);
            System.out.println("The absolute value of " + f + " is : " + abs(f));
        } else {
            int n = Integer.parseInt(args[0]);
            System.out.println("The absolute value of " + n + " is : " + abs(n));
        }
    }

    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static float abs(float f) {
        return f < 0 ? -f : f;
    }
}
