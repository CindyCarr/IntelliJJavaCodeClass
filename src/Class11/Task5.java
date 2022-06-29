package Class11;

public class Task5 {
    public Task5() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 15, 10}, {20, 50, 20}, {30, 30, 30}};
        int evenSum = 0;
        int oddSum = 0;

        for(int j = 0; j < arr.length; ++j) {
            for(int i = 0; i < arr[j].length; ++i) {
                if (arr[j][i] % 2 == 0) {
                    evenSum += arr[j][i];
                } else {
                    oddSum += arr[j][i];
                }
            }
        }

        System.out.println("Odd Sum " + oddSum);
        System.out.println("Even Sum " + evenSum);
    }
}
