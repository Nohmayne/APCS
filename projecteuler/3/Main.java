/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        double target = 600851475143.0;
        double largest = 0.0;

        outerloop: for (double i = 0.0; i < target; i++) {
            if (target % i != 0.0 || i <= largest) {
                continue;
            }
            for (double j = 0.0; j < i; j++) {
                if (i % j == 0.0) {
                    continue outerloop;
                }
            }

            largest = i;
            System.out.println(largest);
        }

        System.out.print(largest);
    }
}