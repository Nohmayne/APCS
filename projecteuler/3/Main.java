import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        double target = 600851475143.0;
        double largest = 0.0;

        List<Double> factors = new ArrayList<>();

        for (double i = 0.0; i < target; i++) {
            if (target % i == 0) {
                factors.add(i);
            }
        }

        System.out.println(factors);

        outerloop: for (int j = 0; j < factors.size(); j++) {
            for (double k = 0.0; k < factors.get(j); k++) {
                if (factors.get(j) % k == 0) {
                    continue outerloop;
                }
            }
            if (factors.get(j) > largest) {
                largest = factors.get(j);
            }
        }

        System.out.print(largest);
    }
}