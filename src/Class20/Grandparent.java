package Class20;

public class Grandparent {

    String name="Pedro";
}
class Parent extends Grandparent{
    void PrintInfo(){
        System.out.println("My dad's name is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("My abuelito's name is "+name);
    }
}
class Grandchild extends Child{
    void printInfo(){
        System.out.println("My great grandfather's name is "+name);
    }

    public static void main(String[] args) {

    }
}