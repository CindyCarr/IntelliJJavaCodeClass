package Class19;

public class SDET extends Human {
    boolean goodWithJava;

    SDET(String name, String eyeColor, String job, int age, boolean goodWithJava) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.job = job;
        this.age = age;
        this.goodWithJava = goodWithJava;
    }

    void printIfo() {
        System.out.println("My name is " + this.name + " i do " + this.job + " am i good with Java " + this.goodWithJava);
    }

    public static void main(String[] args) {
        SDET sdet = new SDET("Sameer", "block", "Gym", 22, true);
        sdet.printIfo();
    }
}
