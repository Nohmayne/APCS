public class Main {

    public static void main(String[] args) {

        double target = 600851475143.0;
        double largest = 0.0;

        for (double i = 1; i < target; i += 2) {
            boolean prime = true;
            if (Math.pow(i, 2) > target) {
                // System.out.println(">^2 " + i);
                break;
            }
            for (double j = 3; j < i / 2; j += 2) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (target % i == 0 && prime && i > largest) {
                // System.out.println("Prime factor: " + i);
                largest = i;
            }
        }

        System.out.println("\n Largest Prime Factor: " + largest);

    }
}