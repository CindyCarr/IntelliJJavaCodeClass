package reviewclass8_1;

import reviewclass8.Doctor;

public class MedicalUniversity {
    public static void main(String[] args) {

        Doctor doc=new Doctor("John","Smith");

        doc.printInfo();
        Doctor.study("GW");
    }
}
