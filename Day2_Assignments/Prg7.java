// Write a java program to find the reverse of an integer number and check the reversed number is a palindrome or not.

public class Prg7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int rev = 0, temp = n;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        System.out.println("The reverse of " + temp + " is : " + rev);

        if (temp == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}

/*
 * Output:
 * 
 * $ javac Prg7.java
 * $ java Prg7 1173711
 * The reverse of 1173711 is : 1173711
 * The number is a palindrome.
 * 
 */
