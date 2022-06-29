package Class22;

public class EmployeeTester {
    public EmployeeTester() {
    }

    public static void main(String[] args) {
        Employee.Manager manager = new Employee.Manager();
        manager.calculatePrintSalary();
        Employee.OfficeBoy officeBoy = new Employee.OfficeBoy();
        officeBoy.calculatePrintSalary();
    }
}
