package Class15;

public class ArrayUtils {
    public ArrayUtils() {
    }

    void printArray(int[] arr) {
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            System.out.println(num);
        }

    }

    int sumArray(int[] arr) {
        int sum = 0;
        int[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            sum += num;
        }

        return sum;
    }
}
