package reviewclass8_1;

import reviewclass8.Doctor;

    public class Practice extends Doctor{

    Practice (String firstName, String lastName){
        super (firstName, lastName);
}


    public static void main(String[] args) {
        Doctor doc=new Doctor("John", "Smith");
        doc.printInfo();

    }

}
