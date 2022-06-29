package Class16;

public class StaticDemo {
    static int noOfEmployees = 10;
    String name;

    public StaticDemo() {
    }

    static void method1() {
        System.out.println(noOfEmployees);
    }

    void method2() {
        System.out.println(noOfEmployees);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name = "Omid";
        StaticDemo st2 = new StaticDemo();
        st2.name = "Rachid";
    }
}
