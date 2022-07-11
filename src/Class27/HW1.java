package Class27;

import java.util.ArrayList;

public class HW1    {
    public static void main(String[] args) {

        // Create an ArrayList that will store 5 names into it.
        // Find out whether the given ArrayList is empty or not?
        // Check whether the specific name is present in an ArrayList or not?
        // Find the size of your arrayList and print all values from that

                ArrayList names=new ArrayList<>();
        names.add("Cindy");
        names.add("Oliver");
        names.add("Jaxx");
        names.add("Michi");
        names.add("Carmen");
        names.add("Darwin");

        System.out.println("This arrayList contains: "+names.size()+" elements");
        System.out.println("Is this arrayList empty: "+names.isEmpty());
        System.out.println("Does this arrayList contain the name Oliver: "+ names.contains("Oliver"));
        System.out.println(names+" ");
    }

        }