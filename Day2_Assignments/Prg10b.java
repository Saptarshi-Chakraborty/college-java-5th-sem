/*
 Write a program to print the following pattern: 
        *****
        ****
        ***
        **
        *
 */

public class Prg10b {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Output:
 * 
 * $ javac Prg10b.java
 * $ java Prg10b 6
 * 
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */