package Stack;

import java.util.Stack;

public class ReversePolishPostOrder {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        if(n == 1)
            return Integer.parseInt(tokens[0]);

        Stack<String> st = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int num1 = Integer.parseInt(st.pop());
                    int num2 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 + num2));
                }
                case "-" -> {
                    int num1 = Integer.parseInt(st.pop());
                    int num2 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num2 - num1));
                }
                case "*" -> {
                    int num1 = Integer.parseInt(st.pop());
                    int num2 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 * num2));
                }
                case "/" -> {
                    int num1 = Integer.parseInt(st.pop());
                    int num2 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num2 / num1));
                }
                default -> st.push(token);
            }
        }
        return Integer.parseInt(st.peek());
    }

    public static void main(String[] args) {
        ReversePolishPostOrder s = new ReversePolishPostOrder();
        String[] tokens =  {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int ans = s.evalRPN(tokens);
        System.out.println("Answer : " + ans);
    }
}
