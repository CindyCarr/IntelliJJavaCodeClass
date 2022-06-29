package Class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array that you want to create");
        int arraySize = scanner.nextInt();
        System.out.println("the size of the arrays is " + arraySize);
        int[] integerArray = new int[arraySize];
        System.out.println("Please enter " + arraySize + " elements");

        int sum;
        for(sum = 0; sum < integerArray.length; ++sum) {
            integerArray[sum] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(integerArray));
        sum = 0;
        int[] var5 = integerArray;
        int var6 = integerArray.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int captainAmerica = var5[var7];
            sum += captainAmerica;
        }

        System.out.println("The sum of all the elemnts is " + sum);
        scanner.close();
    }
}