

package interview;

import java.util.Arrays;

public class RemoveDuplicate {
    public RemoveDuplicate() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 10, 30, 40, 40};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] removeDuplicates(int[] arr) {
        int[] duplicateElementsArr = new int[arr.length];
        int counter = 0;

        int j;
        for(int i = 0; i < arr.length; ++i) {
            for(j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    duplicateElementsArr[i] = arr[i];
                    ++counter;
                }
            }
        }

        int[] arr2 = new int[arr.length - counter];
        j = 0;
        int[] var5 = arr;
        int var6 = arr.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int e = var5[var7];
            if (!isPresent(e, duplicateElementsArr)) {
                arr2[j++] = e;
            }
        }

        return arr2;
    }

    static boolean isPresent(int element, int[] arr) {
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int e = var2[var4];
            if (element == e) {
                return true;
            }
        }

        return false;
    }
}
