package Class18;

public class Car {
    private String make;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String carMake, String carModel, String carColor) {
        this.make = carMake;
        this.model = carModel;
        this.color = carColor;
    }

    public Car(String carModel) {
        this.model = carModel;
    }

    void printCarModel() {
        System.out.println("Model " + this.model);
    }

    void printInfo() {
        System.out.println("Make " + this.make + " Model" + this.model + "Color " + this.color);
    }
}
