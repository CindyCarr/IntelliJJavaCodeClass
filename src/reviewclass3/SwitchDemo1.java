package reviewclass3;

public class SwitchDemo1 {
    public SwitchDemo1() {
    }

    public static void main(String[] args) {
        switch ("Pakistan") {
            case "Turkey":
                System.out.println("Ankara");
                break;
            case "USA":
                System.out.println("DC");
                break;
            case "Serbia":
                System.out.println("Begrade");
                break;
            case "Albania":
                System.out.println("Tirana");
                break;
            case "Afghanistan":
                System.out.println("Kabul");
                break;
            case "Pakistan":
                System.out.println("Islamabad");
                break;
            default:
                System.out.println("Not a valid country");
        }

    }
}
