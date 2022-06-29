package Class19;

class Animal {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Animal() {
    }

    void printInfo() {
        System.out.println("Name " + this.name + " color " + this.color);
    }
}
public class Dog extends Animal {
    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    }class Cat extends Animal {
    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
