package Class19;

public class Task2 {
    public Task2() {
    }

    public static String reverseString(String str) {
        return (new StringBuilder(str)).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Monday"));
    }
}
