package Class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        this.name = dogName;
        this.breed = dogBreed;
        this.color = dogColor;
        if (dogAge > 0 && dogAge < 25) {
            this.age = dogAge;
        } else {
            System.out.println("Dog age can' be greater than 30");
        }

        this.weight = dogWeight;
    }

    void printInfo() {
        System.out.println("Name " + this.name + " Breed " + this.breed + " color " + this.color + " Weight " + this.weight);
    }

    public static void main(String[] args) {
    }
}
