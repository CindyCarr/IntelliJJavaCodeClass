package Class14;

import java.util.Scanner;

public class MethodsDemo {
    public MethodsDemo() {
    }

    void printHello() {
        System.out.println("How are you guys");
    }

    boolean returnTrue() {
        return true;
    }

    int returnInt() {
        return 10;
    }

    public static void main(String[] args) {
        MethodsDemo md = new MethodsDemo();
        md.printHello();
        boolean xs = md.returnTrue();
        int num = md.returnInt();
        System.out.println(num);
        System.out.println(md.returnInt());
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
    }
}