package Class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int age, double weight) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    String getCowInfo() {
        return "Breed " + this.breed + " Color " + this.color + " Age " + this.age + " weight " + this.weight;
    }
}
