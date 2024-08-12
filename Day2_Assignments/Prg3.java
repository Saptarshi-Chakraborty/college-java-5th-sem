// Write a java program to find the sum of digits of an integer number.

public class Prg3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of digits is : " + sum); 
    }
}

/*
 * Output:
 * 
 * $ javac Prg3.java
 * $ java Prg3 123
 * The sum of digits is : 6
 * 
 */
