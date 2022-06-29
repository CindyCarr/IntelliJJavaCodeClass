package Class19;

public class Student {
    double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;

    Student(String name, double grad1Marks, double grad2Marks, double grad3Marks) {
        this.g1Marks = grad1Marks;
        this.g2Marks = grad2Marks;
        this.g3Marks = grad3Marks;
        this.name = name;
    }

    public void calculateAvgGrade() {
        double avgGrade = (this.g1Marks + this.g2Marks + this.g3Marks) / 3.0;
        System.out.println(this.name + avgGrade);
    }
}
