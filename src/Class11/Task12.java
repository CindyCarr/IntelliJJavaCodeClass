package Class11;

public class Task12 {
    public Task12() {
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"AA", "B", "C", "A", "B"};

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i].equals(arr[j]) && i != j) {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}