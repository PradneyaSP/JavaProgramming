import java.util.Stack;

public class B_CopyStack {
    static void copy(Stack<Integer> st1, Stack<Integer> st2) {
        if (st1.size() == 0) return;
        int top = st1.pop();
        copy(st1, st2);
        st2.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Original Stack : " + st);
        Stack<Integer> copyStack = new Stack<>();
        copy(st, copyStack);
        System.out.println("Copied Stack : " + copyStack);
    }
}
