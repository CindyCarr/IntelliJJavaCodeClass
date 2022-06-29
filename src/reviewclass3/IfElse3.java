package reviewclass3;

public class IfElse3 {
    public IfElse3() {
    }

    public static void main(String[] args) {
        String day = "Monday";
        if (day.equals("Monday")) {
            System.out.println("weekday");
        }

        if ("Tuesday".equals(day)) {
            System.out.println("weekday");
        }

        if ("Wednesday".equals(day)) {
            System.out.println("weekday");
        }

        if ("Thursday".equals(day)) {
            System.out.println("weekday");
        }

        if ("Friday".equals(day)) {
            System.out.println("weekday");
        }

        if ("Saturday".equals(day)) {
            System.out.println("Weekend");
        }

        if ("Sunday".equals(day)) {
            System.out.println("Weekend");
        }

    }
}
