// Find out the sum of the digits and check that sum is a prime or not.

public class Prg6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of digits is : " + sum);
        boolean isPrime = true;
        for (int i = 2; i <= sum / 2; i++) {
            if (sum % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The sum of digits is a prime number.");
        } else {
            System.out.println("The sum of digits is not a prime number.");
        }
    }
}

/*
 * Output:
 * 
 * $ javac Prg6.java
 * $ java Prg6 123
 * The sum of digits is : 6
 * The sum of digits is a prime number.
 * 
 */
