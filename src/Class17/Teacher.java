package Class17;

public class Teacher {
    String name;
    private int salary = 125555;
    public String schoolName;

    public Teacher() {
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.salary + " " + this.schoolName);
    }
}
