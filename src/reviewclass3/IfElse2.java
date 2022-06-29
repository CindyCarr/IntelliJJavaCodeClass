package reviewclass3;

public class IfElse2 {
    public IfElse2() {
    }

    public static void main(String[] args) {
        String day = "Monday";
        if (!day.equals("Monday") && !"Tuesday".equals(day) && !"Wednesday".equals(day) && !"Thursday".equals(day) && !"Friday".equals(day)) {
            if (!"Saturday".equals(day) && !"Sunday".equals(day)) {
                System.out.println("Not a valid day");
            } else {
                System.out.println("Weekend");
            }
        } else {
            System.out.println("weekday");
        }

    }
}
