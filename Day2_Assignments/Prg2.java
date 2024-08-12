// Write a java program to find the factorial of an integer number.

public class Prg2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is : " + fact);
    }    
}

/*
 * Output:
 * 
 * $ javac Prg2.java
 * $ java Prg2 7
 * The factorial of 7 is : 5040
 * 
 */
