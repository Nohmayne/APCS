/**
 * while
 */
public class whileloops {

    public static void main(String[] args) {
        // int i = 0;
        // int count = 0;
        // while (i <= 1000) {
        // if (i % 3 == 0 && i % 7 == 0)
        // count += i;
        // i++;
        // }
        // System.out.println(count);

        // String s = "Hello, world!";
        // int i = 0;
        // while (i < s.length()) {
        // System.out.print(s.substring(i, i + 1));
        // i++;
        // }

        // String full = "how now brown cow";
        // String sub = "ow";

        // int i = 0;
        // int countInstance = 0;
        // while (i <= (full.length() - sub.length())) {
        // if (full.substring(i, i + sub.length()).equals(sub)) {
        // countInstance++;
        // System.out.println(sub + " --> " + i);
        // }
        // i++;
        // }
        // System.out.println(countInstance);

        // sum array
        // int[] arr = { 1, 2, 3, 4 };
        // int i = 0;
        // int count = 0;

        // while (i < arr.length) {
        // count += arr[i];
        // i++;
        // }

        // System.out.println(count);

        // indexOf
        // String s = "hello there, general kenobi";
        // String key = "ree";
        // int index = -1;
        // int i = 0;

        // while (i < s.length()) {
        // if (key.equals(s.substring(i, i + 1))) {
        // index = i;
        // break;
        // }
        // i++;
        // }

        // System.out.println("Found " + key + " at index " + index);

        // min
        // int[] arr = { 28135, 4, 72, 889, 24, 2 };
        // int smallest = Integer.MAX_VALUE;
        // int i = 0;
        // while (i < arr.length) {
        // if (smallest > arr[i]) {
        // smallest = arr[i];
        // }
        // i++;
        // }
        // System.out.println(smallest);

        // max
        // int[] arr = { 28135, 4, 72, 889, 24, 2 };
        // int largest = 0;
        // int i = 0;
        // while (i < arr.length) {
        // if (largest < arr[i]) {
        // largest = arr[i];
        // }
        // i++;
        // }
        // System.out.println(largest);

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int curr : arr) {
            System.out.println(curr);
        }
    }
}