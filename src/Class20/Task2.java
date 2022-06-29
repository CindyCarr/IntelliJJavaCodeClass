package Class20;

public class Task2 {

    public static void main(String[] args) {
        E.printF();
    }

}
class G{
    public static void printF(){
        System.out.println("Method printF in class G");
}}
class E extends G{

}