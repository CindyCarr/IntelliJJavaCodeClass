
package reviewclass3;

public class IfElse6 {
    public IfElse6() {
    }

    public static void main(String[] args) {
        String capital;
        switch ("India") {
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
    }
}
