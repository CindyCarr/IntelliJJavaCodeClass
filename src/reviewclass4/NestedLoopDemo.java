package reviewclass4;

public class NestedLoopDemo {
    public NestedLoopDemo() {
    }

    public static void main(String[] args) {
        int x;
        for(x = 1; x <= 2; ++x) {
            System.out.println(x);
        }

        for(x = 1; x <= 2; ++x) {
            System.out.println(x);
        }

        for(x = 1; x <= 2; ++x) {
            System.out.println(x);
        }

    }
}
