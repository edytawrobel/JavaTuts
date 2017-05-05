import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by edytawrobel on 28/04/2017.
 */
public class ChapterFiveTwo {

    public static void main(String[] args) {
        String s1 = "this is a string";
        System.out.println(s1);

        String s2 = new String("this is also a string");
        System.out.println(s2);

        String s3 = "shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars);
        System.out.println(s6);

        char[] chars2 = s6.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
        }

        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance(); // to format as a string, a number of different package (check import statemnet)
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        StringBuilder sb = new StringBuilder("Hello")
            .append(", ")
            .append(", world ")
            .append(", !");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}
