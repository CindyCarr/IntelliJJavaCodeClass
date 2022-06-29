package Class17;

public class Employee {
    public String name;
    public static String manager = "Cindy";
    private int salary;
    String department;

    public Employee() {
    }

    private void printSalary() {
        System.out.println("Salary " + this.salary);
    }

    public static void printManager() {
        System.out.println(manager);
    }

    void printDepartment() {
        System.out.println("Department " + this.department);
    }

    public void printName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Jason";
        emp.department = "IT Destroyer";
        emp.salary = 150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();
    }
}
