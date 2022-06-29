package Class17;

public class DogTester {
    public DogTester() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Jofy", "Russian", "Grey", 15, 20.0);
        new Dog("Foofy", "UK", "Grey", 18, 20.0);
        dog.printInfo();
    }
}
