package reviewclass2;

public class StringConCat {
    public StringConCat() {
    }

    public static void main(String[] args) {
        String firstName = "Ali";
        String lastName = "Baba";
        String fullName = firstName + lastName;
        int num = 10;
        int num2 = 10;
        System.out.println(fullName);
        System.out.println(firstName + num);
        System.out.println(firstName + num + num2);
        System.out.println(firstName + (num + num2));
        System.out.println(num + firstName + num2);
    }
}
