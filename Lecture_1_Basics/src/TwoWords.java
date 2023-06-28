import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        System.out.println("Enter 1st String :");
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();

        System.out.println("Enter 2nd String: ");
        String s2 = scn.nextLine();

        System.out.println("The 2 combines strings are :");
        System.out.println(s1 + ". " + s2);
    }
}
