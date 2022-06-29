package Class11;

public class Task11 {
    public Task11() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 5, 6, 8, 200};
        int maxNumber = arr[0];
        int secondLargest = arr[0];
        int[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int num = var4[var6];
            if (num > maxNumber) {
                secondLargest = maxNumber;
                maxNumber = num;
            }

            if (num > secondLargest && secondLargest < maxNumber && num < maxNumber) {
                secondLargest = num;
            }
        }

        System.out.println(maxNumber);
        System.out.println(secondLargest);
    }
}
