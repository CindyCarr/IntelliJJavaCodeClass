package Class16;

public class GoogleEmployees {
    String name;
    double salary;
    static int noOfEmployees;
    static String companyName = "Google";

    public GoogleEmployees() {
    }

    void displayEmployeeInfo() {
        System.out.println("Name " + this.name + " Salary " + this.salary + " Company Name " + companyName + " Total Employees " + noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name = "Oleg";
        emp1.salary = 250000.0;
        noOfEmployees = 1;
        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name = "Sameer";
        emp2.salary = 250001.0;
        noOfEmployees = 2;
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}
