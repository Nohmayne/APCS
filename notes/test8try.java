/**
 * test8try
 */
public class test8try {

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 0, 4 };
        // int n = a.length;
        // boolean dupfound = false;

        // for (int j = 0; !dupfound && j < n; j++) {
        // for (int k = 1; !dupfound && k < n; k++) {
        // dupfound = (a[j] == a[k]);
        // }
        // }

        // System.out.println(dupfound);
        int n = a.length;
        boolean dupfound = false;

        for (int j = 0; !dupfound && j < n; j++) {
            for (int k = 0; !dupfound && k < j; k++) {
                dupfound = (a[j] == a[k]);
            }
        }

        System.out.println(dupfound);
    }
}