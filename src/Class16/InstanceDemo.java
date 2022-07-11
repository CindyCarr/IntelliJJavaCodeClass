package Class16;

public class InstanceDemo {
    String str = "instance";

    public InstanceDemo() {
    }

    void changeInstanceValue() {
        this.str = "Captain Marvel";
    }

 void printIstanceValue() {
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str);
        id.printIstanceValue();
        id.changeInstanceValue();
        id.printIstanceValue();
    }
}
