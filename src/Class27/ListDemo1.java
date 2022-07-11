package Class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
//We can store the object of a class inside a variable of ype parent class
//interface if that class implements that interface

        List<String> legends = new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yousuf");
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("Hamid"));
        Object [] arr=legends.toArray();
        System.out.println(arr[0]);
        System.out.println(legends);

        List<String> someStudents=new ArrayList<>();
        someStudents.add("Abdul");
        someStudents.add("Naveed");
        someStudents.add("Yusuf");
        System.out.println(legends.containsAll(someStudents));

    }
}