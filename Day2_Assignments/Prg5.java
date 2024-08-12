// WAP to find out sum of digits of a number and check that this sum is an Armstrong number or not.

public class Prg5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0, temp = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.err.println("The sum of digits is : " + sum);
        int armstrong = 0;
        n = temp;
        while (n > 0) {
            armstrong += Math.pow(n % 10, 3);
            n /= 10;
        }
        
        System.err.println("The sum of digits power 3 is : " + armstrong);
        if (sum == armstrong) {
            System.out.println("The sum of digits is an Armstrong number.");
        } else {
            System.out.println("The sum of digits is not an Armstrong number.");
        }
    }
}

/*
 * Output:
 * 
 * $ javac Prg5.java
 * $ java Prg5 153
 * The sum of digits is : 9
 * The sum of digits is an Armstrong number.
 * 
 */