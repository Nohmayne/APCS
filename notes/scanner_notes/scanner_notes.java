import java.util.Scanner;

/**
 * scanner_notes
 */
public class scanner_notes {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Scanning in a string
        System.out.print("Type something here: ");
        String s = scan.nextLine();
        System.out.println(s);
    }
}