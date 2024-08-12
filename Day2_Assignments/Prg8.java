// Read a range from the user.WAP to print all prime numbers which are also palindrome numbers.

import java.lang.*;

public class Prg8 {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        System.out.println(
                "Prime numbers which are also palindrome numbers in the range " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

}

/*
 * Output:
 * 
 * $ javac Prg8.java
 * $ java Prg8 1 500
 * Prime numbers which are also palindrome numbers in the range 1 to 500 are :
 * 2
 * 3
 * 5
 * 7
 * 11
 * 101
 * 131
 * 151
 * 181
 * 191
 * 313
 * 353
 * 373
 * 383
 * 
 */