package Class19;

public class Task8 {
    String name;
    String address;

    Task8(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(this.name + "  " + this.address);
    }

    public static void main(String[] args) {
        Task8 task8 = new Task8("Jose", "street 123");
        task8.displayInfo();
    }
}
