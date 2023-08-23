import java.util.Stack;

public class O_PrefixToPostfix {
    public static String evaluate(String str) {
        Stack<String> values = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            else if (ch > '0' && ch <= '9')
                values.push(ch + "");
            else
                values.push(values.pop() + values.pop() + (ch + ""));
        }
        return values.pop();
    }

    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("Postfix : " + evaluate(prefix));
    }
}
