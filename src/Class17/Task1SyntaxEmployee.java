package Class17;

public class Task1SyntaxEmployee {
    String empId;
    int salary;
    static String CEO = "Sumair";

    public Task1SyntaxEmployee() {
    }

    public static void main(String[] args) {
        Task1SyntaxEmployee emp = new Task1SyntaxEmployee();
        emp.empId = "123";
        emp.salary = 200000;
        Task1SyntaxEmployee emp2 = new Task1SyntaxEmployee();
        emp2.empId = "1234";
        emp2.salary = 250000;
        System.out.println(emp.empId);
        System.out.println(emp.salary);
        System.out.println(emp2.empId);
        System.out.println(emp2.salary);
    }
}
