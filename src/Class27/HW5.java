package Class27;

import java.util.ArrayList;

public class HW5 {
    public static void main(String[] args) {
        // Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that
        // arrayList.

        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0; i<=500; i++) {
            if (i%1==0){
              num.add(i);

            }
        }
for (int i=0; i<num.size(); i++) {
    if (num.get(i)%5==0) {
        num.remove(i);
    }
}
       System.out.println(num+" ");
    }
}
