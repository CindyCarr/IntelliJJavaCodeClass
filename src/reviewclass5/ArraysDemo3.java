package reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo3 {
    public ArraysDemo3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        String[] names = new String[size];

        for(int i = 0; i < names.length; ++i) {
            names[i] = scanner.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
