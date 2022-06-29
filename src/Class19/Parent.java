package Class19;

public class Parent {
    String name = "Misha";
    double money = 1000000.0;

    public Parent() {
    }

    protected void getMarried() {
    }

    class Child extends Parent {
        Child() {
        }

        void printInfo() {
            System.out.println("My full name is Khrystyna " + this.name);
        }

        void buyCar() {
            System.out.println("Hehehhe buing car from Papas money " + this.money);
        }
    }

}