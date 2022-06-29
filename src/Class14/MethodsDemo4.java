package Class14;

public class MethodsDemo4 {
    public MethodsDemo4() {
    }

    public static void main(String[] args) {
        MethodsDemo4 md = new MethodsDemo4();
        System.out.println(md.sumNumbers(10, 10));
        md.printManyTimes("Java", 3);
    }

    int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

    void printManyTimes(String str, int times) {
        for(int i = 0; i < times; ++i) {
            System.out.println(str);
        }

    }
}
