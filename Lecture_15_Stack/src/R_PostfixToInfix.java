import java.util.Stack;

public class R_PostfixToInfix {
    public static String evaluate(String str) {
        Stack<String> values = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            else if (ch > '0' && ch <= '9')
                values.push(ch + "");
            else {
                String v2 = values.pop();
                String v1 = values.pop();
                values.push("(" + v1 + (ch + "") + v2 + ")");
            }
        }
        return values.pop();
    }

    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println("Prefix : " + evaluate(postfix));
    }
}
