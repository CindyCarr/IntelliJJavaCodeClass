package Class13;

public class StringBuilderDemo1 {
    public StringBuilderDemo1() {
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.reverse();
        System.out.println(str);
    }
}