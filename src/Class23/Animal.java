package Class23;

public class Animal {
    final double G=9.8;

  void eat(){
        System.out.println("All animals eat");
    }
}

class Panda extends Animal {
// when "FINAL" is added no classes can inherit from that class because it has been declared as final

void eat(){
    System.out.println("All animals eat");
}
Panda(){
    System.out.println("Parent");
}
}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}