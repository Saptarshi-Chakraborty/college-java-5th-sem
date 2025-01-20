
/*
 * Write a java program to illustrate the concept of Default Constructor, Parameterized
Constructor, Copy Constructor, and Constructor Overloading by designing a class
“Complex”.
 */
import java.util.*;

class Complex {
    int real;
    int imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    void display() {
        System.out.println("Real: " + this.real + " Imaginary: " + this.imaginary);
    }
}

public class Prg2 {

    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.display();

        Complex c2 = new Complex(5, 10);
        c2.display();

        Complex c3 = new Complex(c2);
        c3.display();
    }

}
