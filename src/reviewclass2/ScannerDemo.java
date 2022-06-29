package reviewclass2;

import java.util.Scanner;

public class ScannerDemo {
    public ScannerDemo() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        System.out.println(age + name);
    }
}
