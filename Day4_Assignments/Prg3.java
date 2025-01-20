/*
 * 3. Write a java program that implements constructor chaining.
 */

class Prg3 {
    Prg3() {
        this(10);
        System.out.println("Default Constructor");
    }

    Prg3(int x) {
        this(10, 20);
        System.out.println("Parameterized Constructor 1");
    }

    Prg3(int x, int y) {
        System.out.println("Parameterized Constructor 2");
    }

    public static void main(String[] args) {
        Prg3 obj = new Prg3();
    }

}
