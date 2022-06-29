package reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {
    public ArraysDemo2() {
    }

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < names.length; ++i) {
            names[i] = input.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
