package Class27;

import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {
        // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Pisco");
        drinks.add("Coca Cola");
        drinks.add("Wisky");
        drinks.add("Pepsi");
        drinks.add("Gin");
        drinks.add("Fanta");
        drinks.add("Rum");

        for (int i=0; i< drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "Water");
            }
        }
        System.out.println(drinks+" ");
    }
}
