import java.util.Scanner;
import java.util.Stack;

public class F_BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                if (st.size() != 0 && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }
        }

        return st.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the brackets : ");
        Scanner sc = new Scanner(System.in);
        String brackets = sc.next();
        System.out.println(isBalanced(brackets));
    }
}
