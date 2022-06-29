package Class22;


public class AdvanceCalc {
    public AdvanceCalc() {
    }

    static void sum(int... arr) {
        int sum = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            sum += j;
        }

        System.out.println("Sum of all the parameter values is " + sum);
        printNames("Aladin", "Aladin", "Aladin");
    }

    static void printNames(String... names) {
        String[] var1 = names;
        int var2 = names.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String name = var1[var3];
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        int age = 10;
        String name;
        if (age > 18) {
            name = "Time to go work";
        } else {
            name = "Enjoy no Work";
        }

        System.out.println(name);
        String name2 = age > 18 ? "Time to go work " : "Enjoy no Work";
        System.out.println(name2);
    }
}