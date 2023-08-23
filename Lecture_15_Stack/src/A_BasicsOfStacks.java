import java.util.Stack;

public class A_BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //adding elements into the stack
        st.push(5);
        st.push(8);
        st.push(9);
        st.push(89);
        //printing the topmost element
        System.out.println("The topmost element is : " + st.peek());
        //Removing the topmost element
        st.pop();
        st.pop();
        //printing the stack
        System.out.println(st);
        //printing the size of the stack
        System.out.println("The size of the stack is : " + st.size());
    }
}
