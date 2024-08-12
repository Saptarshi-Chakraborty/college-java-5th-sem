/*
 Write a program to print the following pattern: 

        *********
         *******
          *****
           ***
            *
 */

public class Prg10d {
       public static void main(String[] args) {
              int n = Integer.parseInt(args[0]);
              for (int i = n; i >= 1; i--) {
                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }
                     for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }
}

/*
 * Output:
 * 
 * $ javac Prg10d.java
 * $ java Prg10d 5
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * 
 */
