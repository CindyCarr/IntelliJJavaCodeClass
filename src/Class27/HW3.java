package Class27;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        // Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> city=new ArrayList<>();
        city.add("Culmore");
        city.add("Reston");
        city.add("Herndon");
        city.add("Ashburn");
        city.add("South Riding");
        city.add("Annandale");
        city.add("Fairfax");

        for (int i=0; i<city.size(); i++) {
            if (city.get(i).endsWith("e")) {
            city.remove(i);
        }
        }
        System.out.println(city);
    }
}
