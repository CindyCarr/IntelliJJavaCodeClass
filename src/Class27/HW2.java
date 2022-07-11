package Class27;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        //Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Lexus");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Cadillac");

        System.out.println(cars);
        System.out.println(cars.clone());
        for (String c:cars){
            System.out.print(c+" ");
        }






    }
}
