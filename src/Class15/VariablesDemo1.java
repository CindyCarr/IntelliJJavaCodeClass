package Class15;

public class VariablesDemo1 {
    String breed;
    static int num = 5;

    public VariablesDemo1() {
    }

    void printName() {
        String name = "Local";
        System.out.println(name);
    }

    static void printName2() {
        String name = "Local";
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v = new VariablesDemo1();
        v.printName();
        System.out.println(num);
        printName2();
    }
}
