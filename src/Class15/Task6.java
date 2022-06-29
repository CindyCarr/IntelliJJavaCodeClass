package Class15;

public class Task6 {
    public Task6() {
    }

    boolean isPrime(int x) {
        boolean isPrime = true;
        if (x > 1) {
            for(int i = 2; i < x; ++i) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Task6 task = new Task6();
        System.out.println(task.isPrime(5));
    }
}
