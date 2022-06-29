package Class17;

public class Task2Students {
    String name;
    String id;
    static int numberOfStudents;

    public Task2Students() {
    }

    public static void main(String[] args) {
        Task2Students task2Students = new Task2Students();
        task2Students.name = "Arif007";
        task2Students.id = "JB123";
        numberOfStudents = 1;
        System.out.println(task2Students.name);
        System.out.println(task2Students.id);
        System.out.println(numberOfStudents);
        Task2Students task2Students2 = new Task2Students();
        task2Students2.name = "Arif008";
        task2Students2.id = "JB1234";
        numberOfStudents = 2;
        System.out.println(task2Students2.name);
        System.out.println(task2Students2.id);
        System.out.println(numberOfStudents);
    }
}
