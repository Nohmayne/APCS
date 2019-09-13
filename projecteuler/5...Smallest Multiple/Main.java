/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        boolean solved = false;
        int sm = 1;

        sloop: while (!solved) {
            for (int i = 1; i <= 20; i++) {
                if (sm % i != 0) {
                    sm++;
                    continue sloop;
                }
            }
            solved = true;
        }

        System.out.println(sm);
    }
}