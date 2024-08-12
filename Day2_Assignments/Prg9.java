// WAP to read different types of data types and print the values with Scanner class.

import java.util.Scanner;


public class Prg9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int num = scanner.nextInt();
        
        System.out.print("Enter a float : ");
        float flt = scanner.nextFloat();
        
        System.out.print("Enter a double : ");
        double d = scanner.nextDouble();
        
        System.out.print("Enter a string : ");
        String s = scanner.next();
        
        scanner.close();

        System.out.println("\nThe integer value is : " + num);
        System.out.println("The float value is   : " + flt);
        System.out.println("The double value is : " + d);
        System.out.println("The string value is : " + s);
        
    }
}

/*
 * Output:
 * 
 * $ javac Prg9.java
 * $ java Prg9
 * Enter an integer : 7
 * Enter a float : 3.14
 * Enter a double : 3.14159
 * Enter a string : Hello
 * 
 * The integer value is : 7
 * The float value is : 3.14
 * The double value is : 3.14159
 * The string value is : Hello
 * 
 */