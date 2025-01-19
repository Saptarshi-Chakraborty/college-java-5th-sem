/*
 * Write a program to demonstrate non-static members of a class.
    a) Access within the same class as main function belongs to.
    b) Access from a different class.
 */

class NonStaticDemo {
    // Non-static fields
    private int number;
    private String message;

    // Non-static methods
    public void setValues(int num, String msg) {
        this.number = num;
        this.message = msg;
    }

    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

}

class OtherClass {
    public void accessNonStaticMembers() {
        NonStaticDemo demo = new NonStaticDemo();
        demo.setValues(200, "Hello from different class!");
        demo.displayValues();
    }
}

class Prg4{
    public static void main(String[] args) {
        // Accessing non-static members within same class
        NonStaticDemo demo = new NonStaticDemo();
        demo.setValues(100, "Hello from same class!");
        demo.displayValues();
        
        // Accessing non-static members from different class
        OtherClass other = new OtherClass();
        other.accessNonStaticMembers();
    }
}