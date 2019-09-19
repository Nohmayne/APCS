/**
 * string_notes
 */
public class string_notes {

    public static void main(String[] args) {
        String s1 = "hello" + 2 + 3;
        String s2 = new String("world");
        String s3 = s1 + " " + s2;
        String s4 = 2 + 3 + "hello";

        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println(s4.indexOf("hello"));

        String javadoc = "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html";

        System.out
                .println("\n---------------------------------------------\nJava Documentation on Strings: " + javadoc);
    }
}