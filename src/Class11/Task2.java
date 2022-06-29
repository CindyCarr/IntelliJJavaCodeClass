package Class11;

import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array that you want to create");
        int arraySize = scanner.nextInt();
        String[] countryArray = new String[arraySize];

        for(int i = 0; i < countryArray.length; ++i) {
            countryArray[i] = scanner.next();
        }

        String[] var8 = countryArray;
        int var5 = countryArray.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String element = var8[var6];
            if (element.equalsIgnoreCase("usa")) {
                System.out.println("Washington DC");
            } else if (element.equalsIgnoreCase("turkey")) {
                System.out.println("Anakara");
            } else if (element.equalsIgnoreCase("Thailand")) {
                System.out.println("Bangkok");
            } else {
                System.out.println("Contry not supported by My Great java program version 1.0");
            }
        }

        scanner.close();
    }
}