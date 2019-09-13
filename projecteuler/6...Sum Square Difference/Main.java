/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        double sumOfSquares = 0;
        double squareOfSum = 0;

        int difference = 0;

        for (double i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }

        for (double j = 1; j <= 100; j++) {
            squareOfSum += j;
        }

        squareOfSum = Math.pow(squareOfSum, 2);

        difference = (int) (squareOfSum - sumOfSquares);

        System.out.println(difference);
    }
}