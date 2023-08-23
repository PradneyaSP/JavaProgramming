import java.util.Stack;

public class M_PrefixEvaluation {

    private static int evaluate(String str) {
        Stack<Integer> values = new Stack<>();
        for(int i = str.length()-1 ; i >=0 ; i--){
            char ch = str.charAt(i);
            if(ch == ' ')
                continue;
            else if(ch > 48 &&  ch <= 57)
                values.push(((int)ch - 48));
            else {
                //Note this change
                int v1 = values.pop();
                int v2 = values.pop();
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
        System.out.println(evaluate("-9/*+5346"));
    }
}

