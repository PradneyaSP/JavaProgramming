import java.util.Stack;

public class D_DisplayStack {
    static void display(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        display(st);
        System.out.print(top + " ");
        st.push(top);
    }

    static void displayReverse(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverse(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.print("Original Stack : ");
        display(st);
        System.out.print("\nReversed Stack : ");
        displayReverse(st);
    }
}
