package reviewclass4;

import java.util.Scanner;

public class WhileLoopDemo4 {
    public WhileLoopDemo4() {
    }

    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        while(x != 10) {
            System.out.println("Please enter the number");
            x = scanner.nextInt();
            System.out.println(x + 2);
        }

    }
}
