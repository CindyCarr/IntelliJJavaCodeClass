package Class16;

import Class17.Employee;

public class EmployeeTester {
    public EmployeeTester() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Merve";
        System.out.println(Employee.manager);
        Employee.printManager();
    }
}
