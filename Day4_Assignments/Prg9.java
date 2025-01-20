/*
 * Write a java program that overloads the difference function and returns the difference of two integers / one integer and one float / one double and one long taken as user input.
 */

import java.util.*;

class Difference {
    int difference(int a, int b) {
        return a - b;
    }

    float difference(int a, float b) {
        return a - b;
    }

    double difference(double a, long b) {
        return a - b;
    }
}

public class Prg9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Difference d = new Difference();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Difference of " + a + " and " + b + ": " + d.difference(a, b));

        System.out.print("Enter an integer and a float: ");
        a = sc.nextInt();
        float c = sc.nextFloat();
        System.out.println("Difference of " + a + " and " + c + ": " + d.difference(a, c));

        System.out.print("Enter a double and a long: ");
        double e = sc.nextDouble();
        long f = sc.nextLong();
        System.out.println("Difference of " + e + " and " + f + ": " + d.difference(e, f));
    }
}
