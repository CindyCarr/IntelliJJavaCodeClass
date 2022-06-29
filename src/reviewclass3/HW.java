package com.syntax.reviewclass3;

import java.util.Scanner;

public class HW {
    public HW() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is there a sale going on");
        boolean isSale = scan.nextBoolean();
        if (!isSale) {
            System.out.println("you are not going for shopping");
        } else {
            System.out.println("Pleas enter which item you want to buy and also enter its price");
            String item = scan.next();
            double price = scan.nextDouble();
            double discountedPrice = 0.0;
            if (price < 20.0) {
                discountedPrice = price * 0.9;
                System.out.println("After discount " + item + " the price of the item reduce from" + price + " to" + discountedPrice + "+");
            } else if (price >= 20.0 && price <= 100.0) {
                discountedPrice = price * 0.8;
                System.out.println("After discount " + item + " the price of the item reduce from" + price + " to" + discountedPrice + "+");
            }
        }

    }
}
