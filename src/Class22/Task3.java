package Class22;

public class Task3 {
    public Task3() {
    }

    static void sayHello() {
        System.out.println("Hello Batch 13");
    }

    static void sayHello(String msg) {
        System.out.println(msg);
    }

    static void sayHello(String msg, int times) {
        for(int i = 0; i < times; ++i) {
            System.out.println(msg);
        }

    }

    public static void main(String[] args) {
        sayHello("Zameer stop wasting time on IG", 5);
    }
}
