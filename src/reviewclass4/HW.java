package reviewclass4;

import java.util.Scanner;

public class HW {
    public HW() {
    }

    public static void main(String[] args) {
        double accumulatedAmount = 0.0;
        Scanner input = new Scanner(System.in);

        double amountToPayOff;
        do {
            System.out.println("Enter the item name that you want to buy");
            String itemName = input.next();
            System.out.println("Enter the price of item");
            double itemPrice = input.nextDouble();
            accumulatedAmount += itemPrice;
            System.out.println("Please Enter the money");
            double money = input.nextDouble();
            amountToPayOff = money - accumulatedAmount;
            if (amountToPayOff < 0.0) {
                System.out.println("Amount to pay off " + -1.0 * amountToPayOff);
            }
        } while(amountToPayOff < 0.0);

        System.out.println("Here is your change " + amountToPayOff + " Thank you for shopping!");
    }
}
