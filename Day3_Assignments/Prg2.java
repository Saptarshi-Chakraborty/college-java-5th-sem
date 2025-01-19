/* Create a class box with three member variables width, height and depth. Also create a member function to initialize member variables. Now write another member function to calculate the volume of box and print the result in main function.
*/

class Box {
    int width, height, depth;

    void init(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    int volume() {
        int vol = width * height * depth;
        return vol;
    }
}

public class Prg2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.init(10, 20, 30);
        int volume = b1.volume();
        System.out.println("Volume of box is: " + volume);
    }

}
