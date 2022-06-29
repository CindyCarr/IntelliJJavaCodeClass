package reviewclass3;

public class IfElse5 {
    public IfElse5() {
    }

    public static void main(String[] args) {
        String country = "Pakistan";
        if ("Turkey".equals(country)) {
            System.out.println("Ankara");
        } else if ("USA".equals(country)) {
            System.out.println("DC");
        } else if ("Serbia".equals(country)) {
            System.out.println("Begrade");
        } else if ("Albania".equals(country)) {
            System.out.println("Tirana");
        } else if ("Afghanistan".equals(country)) {
            System.out.println("Kabul");
        } else if ("Pakistan".equals(country)) {
            System.out.println("Islamabad");
        } else {
            System.out.println("Not a valid country");
        }

    }
}
