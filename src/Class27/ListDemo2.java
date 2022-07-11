package Class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>(); //recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yousuf");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends); //adds everything from legends to all students
        allStudents.addAll(moreStudents); // adds moreStudents to AllStudents
        System.out.println(allStudents);
        allStudents.removeAll(legends); //removes legends from allStudents
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);
    }
}
