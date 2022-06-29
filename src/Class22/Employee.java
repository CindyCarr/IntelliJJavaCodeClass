package Class22;
public class Employee {
    String name;
    int baseSalary = 30000;
    int baseHolidays = 10;

    public Employee() {
    }

    void calculatePrintSalary() {
        System.out.println(this.baseSalary);
    }

    void calculatePrintHolidays() {
        System.out.println(this.baseHolidays);
    }

    static class Manager extends Employee {
        Manager() {
        }

        void calculatePrintSalary() {
            System.out.println(this.baseSalary * 4 + 20000);
        }

        void calculatePrintHolidays() {
            System.out.println(this.baseHolidays * 3);
        }
    }

    class Developer extends Employee {
        Developer() {
        }

        void calculatePrintSalary() {
            System.out.println(this.baseSalary * 2 + 300000);
        }

        void calculatePrintHolidays() {
            System.out.println(this.baseHolidays * 2);
        }
    }

    static class OfficeBoy extends Employee {
        OfficeBoy() {
        }
    }

}
