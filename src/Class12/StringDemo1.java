package Class12;

public class StringDemo1 {
    public StringDemo1() {
    }

    public static void main(String[] args) {
        String name = new String("Oleg");
        String name2 = "Oleg";
        System.out.println(name.length());
        name2 = " Z ameer ";
        System.out.println(name2.length());
        String name3 = "Oleg";
        System.out.println(name3.length());
        String captain = "NAVEED";
        System.out.println(captain.toLowerCase());
        captain = "I love Java";
        System.out.println(captain.toUpperCase());
    }
}