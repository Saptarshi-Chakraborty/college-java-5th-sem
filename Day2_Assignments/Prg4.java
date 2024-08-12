// Write a java program to implement the pow() function.

public class Prg4 {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exp = Integer.parseInt(args[1]);
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exp + " is : " + result);
    }
}

/*
 * Output:
 * 
 * $ javac Prg4.java
 * $ java Prg4 2 3
 * 2 raised to the power 3 is : 8
 * 
 */
