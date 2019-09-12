/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int fib = 1;
        int addend = 1;
        int temp = 0;

        int sum = 0;

        for (; fib < 4000000;) {
            if (fib % 2 == 0) {
                sum += fib;
            }

            temp = fib;
            fib += addend;
            addend = temp;
        }

        System.out.print(sum);
    }
}