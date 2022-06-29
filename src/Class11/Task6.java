package Class11;

public class Task6 {
    public Task6() {
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
