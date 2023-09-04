import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class I_FirstNegativeInWindow {
    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        Queue<Integer> neg = new LinkedList<>();
        long[] ans = new long[N - K + 1];
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) neg.add(i);
        }

        for (int i = 0; i < N - K + 1; i++) {
            if (neg.size() != 0 && neg.peek() < i) neg.remove();
            if (neg.size() != 0 && neg.peek() <= i + K) ans[i] = A[neg.peek()];
            else ans[i] = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        long[] a = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(Arrays.toString(printFirstNegativeInteger(a, 8, 3)));
    }
}
