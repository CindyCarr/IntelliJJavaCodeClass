package Class17;

import Class16.Dog;

public class Tester {
    public Tester() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Mike";
        employee.department = "IT Saver";
        employee.printDepartment();
        new Dog();
    }
}
