package Class15;

public class Task5 {
    String name;

    public Task5() {
    }

    String completeEmail(String firstName, String lastName, String emailType) {
        return firstName + lastName + "@" + emailType + ".com";
    }

    public static void main(String[] args) {
        Task5 task = new Task5();
        System.out.println(task.completeEmail("Tara", "Sitara", "gmail"));
    }
}
