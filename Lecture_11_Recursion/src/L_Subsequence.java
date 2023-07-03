import java.util.ArrayList;
import java.util.Scanner;

public class L_Subsequence {
    static ArrayList<String> returnSSQ(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = str.charAt(0);
        ArrayList<String> smallAns = returnSSQ(str.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    static void printSSQ(String str, String currAns) {
        if (str.length() == 0) {
            System.out.print(currAns + " ");
            return;
        }
        //Storing the current element in curr
        char curr = str.charAt(0);
        String remAns = str.substring(1);
        //Case 1 : current char is included in currAns
        printSSQ(remAns, currAns + curr);
        //Case 2 : current char is not included in currAns
        printSSQ(remAns, currAns);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("The Subsequences of the String are : ");
        System.out.println(returnSSQ(str));
        printSSQ(str, "");
    }
}
