package Class11;

public class Task9 {
    public Task9() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 50, 5, 8};
        int maxNumber = arr[0];
        int minNumber = arr[0];
        int[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int num = var4[var6];
            if (num > maxNumber) {
                maxNumber = num;
            }

            if (num < minNumber) {
                minNumber = num;
            }
        }

        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
