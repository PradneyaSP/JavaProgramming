import java.util.Scanner;
import java.util.Stack;

public class C_InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Original Stack : " + st);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to Insert : ");
        int pos = sc.nextInt();
        System.out.println("Enter the element : ");
        int n = sc.nextInt();

        Stack<Integer> temp = new Stack<>();
        while (st.size() >= pos)
            temp.push(st.pop());

        st.push(n);

        while (temp.size() > 0)
            st.push(temp.pop());

        System.out.println("New Stack : " + st);
    }
}
