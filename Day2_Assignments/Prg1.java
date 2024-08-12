/* Write a java program to solve the following series 
* 1-2+3-4+...+N = ? 
*/

import java.lang.*;

class Prg1 {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int sum = 0, sign = 1;
        for (int i = 1; i <= n; i++) {
            sum += i * sign;
            sign *= -1;
        }
        System.out.println("The Sum is : " + sum);
    }
}

/*
 * Output:
 * 
 * $ javac Prg1.java
 * $ java Prg1 5
 * The Sum is : 3
 * 
 */