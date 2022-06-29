package reviewclass8;

public class Hospital {

    public static void main(String[] args) {

        Doctor doc=new Doctor("Jane","Smith");
        doc.printInfo();

        Doctor.hospital="UCSF";
        doc.work();

        System.out.println("====================================================================================");

        //creating another doctor
        Doctor doctor=new Doctor("Joe","Doe","cardiologyst",10);
        doctor.printInfo();
        doctor.work();

        System.out.println("=====================================================================================");

        //changing value od static variable
        System.out.println("Changing value of static variable ");
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();

        System.out.println("=====================================================================================");

        //changing value od instance variable
        System.out.println("Changing value of instance variable ");
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Clinic";

        System.out.println("======================================================================================");

        doc.work();
        doctor.work();

        System.out.println("=======================================================================================");
        doctor.treat("Samantha");


        Doctor.study("GTU");
        ;


    }
}
