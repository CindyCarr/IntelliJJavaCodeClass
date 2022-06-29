package Class17;

public class IntelliJFeature3 {
    public IntelliJFeature3() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            System.out.println(j);
        }

    }
}
