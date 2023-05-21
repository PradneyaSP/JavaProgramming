import javax.print.DocFlavor;
import java.util.Scanner;

public class ReverseWords {
    public static String reverse(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        int start = 0, i;
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder str = new StringBuilder("");
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append(reverse(s.substring(start, i)));
                str.append(' ');
                start = i + 1;
            }
        }
        str.append(reverse(s.substring(start, i)));
        System.out.println(str);
    }
}
