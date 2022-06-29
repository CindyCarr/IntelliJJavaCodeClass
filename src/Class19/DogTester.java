package Class19;

public class DogTester {
    public DogTester() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat("kitty", "green");
        cat.printInfo();
        Dog dog = new Dog("Max", "Blue");
        dog.printInfo();
    }
}
