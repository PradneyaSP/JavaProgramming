import java.util.Scanner;

public class Palindrome {
    public static boolean palindromeCheck(String s) {
        boolean flag = true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                if(palindromeCheck(st.substring(i,j))){
                    System.out.print(st.substring(i,j)+" ");
                    count++;
                }
            }
        }

        System.out.println("\nThe number of Palindromic substrings are : " + count);
    }
}
