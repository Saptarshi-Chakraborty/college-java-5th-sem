/*
 * Write a java program that overloads the square function that prints the square value of an integer or a float or a long input value.
 */

import java.util.*;

class Square {
    void square(int a) {
        System.out.println("Square of " + a + ": " + a * a);
    }

    void square(float a) {
        System.out.println("Square of " + a + ": " + a * a);
    }

    void square(long a) {
        System.out.println("Square of " + a + ": " + a * a);
    }
}

public class Prg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s = new Square();

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        s.square(a);

        System.out.print("Enter a float: ");
        float b = sc.nextFloat();
        s.square(b);

        System.out.print("Enter a long: ");
        long c = sc.nextLong();
        s.square(c);
    }
}

