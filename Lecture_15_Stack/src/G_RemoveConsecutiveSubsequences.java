import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class G_RemoveConsecutiveSubsequences {
    public static int[] removeSub(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || arr[i] != st.peek())
                st.push(arr[i]);
            else if (arr[i] == st.peek()) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1])
                    st.pop();
            }
        }

        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 4, 5, 6, 8, 8, 8, 2};
        System.out.println(Arrays.toString(removeSub(arr)));
    }


}
