package reviewclass5;

public class ArraysDemo5 {
    public ArraysDemo5() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 8, 9};
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int number = var2[var4];
            System.out.println(number);
        }

    }
}
