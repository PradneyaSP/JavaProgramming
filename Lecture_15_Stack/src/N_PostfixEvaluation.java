import java.util.Stack;

public class N_PostfixEvaluation {

    private static int evaluate(String str) {
        Stack<Integer> values = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == ' ')
                continue;
            else if(ch > 48 &&  ch <= 57)
                values.push(((int)ch - 48));
            else {
                int v2 = values.pop();
                int v1 = values.pop();
                switch (ch) {
                    case '+' -> values.push(v1 + v2);
                    case '-' -> values.push(v1 - v2);
                    case '*' -> values.push(v1 * v2);
                    case '/' -> values.push(v1 / v2);
                }
            }
        }
        return values.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("953+4*6/+"));
    }
}
