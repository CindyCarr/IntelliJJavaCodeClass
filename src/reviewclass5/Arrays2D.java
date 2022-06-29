package reviewclass5;

import java.util.Arrays;

public class Arrays2D {
    public Arrays2D() {
    }

    public static void main(String[] args) {
        int[] row0 = new int[]{1, 2, 3, 4, 5};
        int[] row1 = new int[]{1, 2, 3};
        int[] row2 = new int[]{1, 2, 3, 4, 5};
        int[] row3 = new int[]{1, 2, 3, 4, 5};
        int[] row4 = new int[]{1, 2, 3, 4, 5};
        int[][] matrix = new int[][]{row0, row1, row2, row3, row4};
        int[][] var7 = matrix;
        int var8 = matrix.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            int[] array = var7[var9];
            System.out.println(Arrays.toString(array));
        }

    }
}
