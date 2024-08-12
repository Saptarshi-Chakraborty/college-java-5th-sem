/*
 Write a program to print the following pattern: 
        *
        **
        ***
        ****
        *****
 */

public class Prg10a {
       public static void main(String[] args) {
              int n = Integer.parseInt(args[0]);

              for (int i = 1; i <= n; i++) {
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
 * $ javac Prg10a.java
 * $ java Prg10a 4
 * *
 * **
 * ***
 * ****
 * 
 */