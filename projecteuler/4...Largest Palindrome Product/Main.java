/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int largest = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                boolean pallindrome = true;
                int product = i * j;
                String s = "" + product;

                if (s.length() % 2 != 0) {
                    continue;
                }

                String s1 = s.substring(0, s.length() / 2);
                String s2 = s.substring(s.length() / 2);

                if (s1.length() != s2.length()) {
                    continue;
                }

                for (int k = 0; k < s1.length(); k++) {
                    if (s1.charAt(k) != s2.charAt(s2.length() - k - 1)) {
                        pallindrome = false;
                        break;
                    }
                }

                if (pallindrome && product > largest) {
                    largest = product;
                }
            }
        }

        System.out.println(largest);
    }
}