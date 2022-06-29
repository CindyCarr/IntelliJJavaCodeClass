package reviewclass8;

public class Doctor {

    public String firstName, lastName;
    protected String specialty;
    int experience;
    private double salary;

    public static String hospital;

    public Doctor(String firstName, String lastName){
       this.firstName=firstName;
       this.lastName=lastName;
}
Doctor(String firstName, String lastName, String speciality, int experience ){
        this(firstName, lastName);
        this.specialty=speciality;
        this.experience=experience;
}
public void printInfo(){
    System.out.println("Doctor name is "+firstName+" "+lastName+" and speciality is "+specialty);
}
protected void work(){
    System.out.println("Doctor "+lastName+" "+" works at "+hospital);
}
void treat(String patientName){
        this.printInfo();
    System.out.println(" Treats patient "+patientName);
}
private void getPaid(){
    System.out.println("Doctor "+lastName+" gets paid "+salary);
}
//static methods can work only with static variables
public static void study (String University){
//printInfo(); //cant make a static reference to the non-static method
    System.out.println("Doctor studied at "+University+" and now works at "+hospital);
}
}
