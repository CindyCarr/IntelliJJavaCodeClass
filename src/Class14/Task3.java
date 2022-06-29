package Class14;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        String str = "Is it saturday? Is it raining? Do we have a Java Class today? i love Java. we go to park today.";
        System.out.println(str.split("[?.!]").length);
    }
}
