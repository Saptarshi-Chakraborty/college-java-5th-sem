/*
 Write a program to print the following pattern: 

            *
           ***
          *****
         *******
        *********
 */

public class Prg10c {
       public static void main(String[] args) {
              int n = Integer.parseInt(args[0]);
              for (int i = 1; i <= n; i++) {
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
 * $ javac Prg10c.java
 * $ java Prg10c 4
 *     *
 *    ***
 *   *****
 *  *******
 * 
 */    
