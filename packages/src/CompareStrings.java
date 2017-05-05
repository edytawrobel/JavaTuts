/**
 * Created by edytawrobel on 29/04/2017.
 */
public class CompareStrings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4 == str5) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String cal = "Welcome to California";
        System.out.println();

        int position = cal.indexOf("California");
        System.out.println("position of substring: " + position);

        String sub = cal.substring(11);
        System.out.println(sub);
    }
}
