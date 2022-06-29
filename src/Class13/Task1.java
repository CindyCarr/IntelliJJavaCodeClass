package Class13;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        new String("Hello");
        String str2 = "Hello";
        if (!str2.isEmpty() && str2.length() % 2 != 0 && str2.length() >= 3) {
            int middle = str2.length() / 2;
            System.out.println(str2.charAt(middle));
        }

    }
}
