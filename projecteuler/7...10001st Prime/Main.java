/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        double primeIndex = 1;
        double current = 3;

        double maxPrime = 0;

        cloop: while (primeIndex < 10001) {
            if (current % 2 == 0) {
                current++;
                continue;
            }
            for (double i = 3; i < current; i += 2) {
                if (current % i == 0) {
                    current++;
                    continue cloop;
                }
            }

            System.out.println("Prime: " + current);
            System.out.println(" Index: " + primeIndex);

            maxPrime = current;
            current += 2;
            primeIndex++;
        }

        System.out.println("\nMaxPrime: " + maxPrime);
    }
}