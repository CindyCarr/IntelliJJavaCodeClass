package reviewclass3;

import java.util.Scanner;

public class ScannerAndSwitch {
    public ScannerAndSwitch() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the country");
        String capital;
        switch (scanner.nextLine()) {
            case "Turkey":
                capital = "Ankara";
                break;
            case "USA":
                capital = "DC";
                break;
            case "Serbia":
                capital = "Belgrade";
                break;
            case "Albania":
                capital = "Tirana";
                break;
            case "Afghanistan":
                capital = "Kabul";
                break;
            case "Pakistan":
                capital = "Islamabad";
                break;
            default:
                capital = "Either country name is included correct or its not a country";
        }

        System.out.println(capital);
        scanner.close();
    }
}
