package Class14;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        String str = "asdasd132546!@#";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
    }
}
