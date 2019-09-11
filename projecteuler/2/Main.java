/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int lastNum = 1;

        int sum = 0;

        for (int i = 1; i < 4.0E6;) {

            // System.out.print(lastNum + ", ");
            // System.out.print(i + ", ");

            if (lastNum % 2 == 0) {
                sum += lastNum;
            }
            if (i % 2 == 0) {
                sum += i;
            }

            lastNum += i;
            i += lastNum;

        }

        System.out.println(sum);
    }
}