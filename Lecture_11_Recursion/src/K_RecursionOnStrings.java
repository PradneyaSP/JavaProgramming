import java.util.Scanner;

public class K_RecursionOnStrings {

    static String removeA(String str) {
        //If we have reached the end of string , then return empty string.
        if (str.equals("")) return "";
        //If the current character is not equal to a then add the current element to the string
        if (str.charAt(0) != 'a')
            return str.charAt(0) + removeA(str.substring(1));//the substring method removes the first element.
            // else return the string without adding the current element
        else return removeA(str.substring(1));
    }

    static String reverse(String str) {
        if (str.equals("")) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    static boolean palindrome(String str, int left, int right) {
        if (left > right) return true;
        else if (str.charAt(left) != str.charAt(right)) return false;

        return palindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str;
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println();
        System.out.println("After Removing all 'a' in the String : ");
        System.out.println(removeA(str));
        System.out.println();
        String ans = reverse(str);
        System.out.println("Reversing the String : ");
        System.out.println(ans);
        System.out.println();
        if (palindrome(str, 0, str.length() - 1)) System.out.println(str + " is a Palindrome");
        else System.out.println(str + " is not a Palindrome");
    }
}
