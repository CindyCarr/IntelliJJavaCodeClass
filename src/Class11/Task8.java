package Class11;

public class Task8 {
    public Task8() {
    }

    public static void main(String[] args) {
        int previousNumber = 0;
        int currentNumber = 1;
        int nextNumber = 10;
        int numbersToPrint = 10;
        System.out.print("0 ");
        System.out.print("1 ");

        for(int i = 0; i < numbersToPrint - 2; ++i) {
            nextNumber = previousNumber + currentNumber;
            System.out.print(nextNumber + " ");
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

    }
}