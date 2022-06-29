package Class14;

public class MethodsDemo3 {
    public MethodsDemo3() {
    }

    public static void main(String[] args) {
        MethodsDemo3 md = new MethodsDemo3();
        System.out.println(md.isEven(3));
        System.out.println(md.checkString("hello"));
    }

    boolean checkString(String str) {
        return str.length() % 2 == 0;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
}
