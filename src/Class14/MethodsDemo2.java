package Class14;

public class MethodsDemo2 {
    public MethodsDemo2() {
    }

    public static void main(String[] args) {
        MethodsDemo2 md = new MethodsDemo2();
        md.printManyTimes(5);
    }

    void print() {
        for(int i = 0; i < 5; ++i) {
            System.out.println("Tara is great");
        }

    }

    void printManyTimes(int times) {
        for(int i = 0; i < times; ++i) {
            System.out.println("Tara is great");
        }

    }
}