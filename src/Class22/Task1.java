package Class22;

public class Task1 {
    public Task1() {
    }

    static void area(double length, double width) {
        System.out.println("Area of Rectangle " + length * width);
    }

    static void area(double length) {
        System.out.println("Area of Square " + length * length);
    }

    static void volume(double len, double wid, double hi) {
        System.out.println("Volume of box " + len * wid * hi);
    }

    public static void main(String[] args) {
        area(10.0);
    }
}
