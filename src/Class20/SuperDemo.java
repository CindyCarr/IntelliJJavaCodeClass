package Class20;

public class SuperDemo {

    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
class Furniture{

    String color="Black"; //color is defined
}
class Chair extends Furniture{
    String color="Grey"; //color is defined
    void printColor(){
        String color="White"; // color is defined ** local variables are preferred**
        System.out.println(color); //white - (local)
        System.out.println(this.color); //grey -(this.)
        System.out.println(super.color); //black - (super.)

    }
}