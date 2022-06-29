package Class11;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 15, 10}, {20, 50, 20}, {30, 30, 30}};
        int sum = 0;

        for(int j = 0; j < arr.length; ++j) {
            for(int i = 0; i < arr[j].length; ++i) {
                sum += arr[j][i];
            }
        }

        System.out.println(sum);
    }
}