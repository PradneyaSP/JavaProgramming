import java.util.Stack;

public class Solution {
    public static int[] calculateSpan(int[] price, int n) {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && price[i] >= price[st.peek()])
                st.pop();
            if (st.size() == 0)
                ans[i] = i + 1;
            else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        return ans;
    }

    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                count++;
                st.pop();
            } else
                continue;

            if (st.size() == 0) {
                if (max < count)
                    max = count;
                count = 0;
            }

        }
        return max;
    }

    //Next Smaller concept
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            while (st.size() != 0 && prices[i] < st.peek())
                st.pop();
            if (st.size() == 0) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - st.peek();
            }
            st.push(prices[i]);
        }
        return ans;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (st.size() != 0 && temperatures[i] > temperatures[st.peek()])
                st.pop();
            if (st.size() == 0)
                ans[i] = 0;
            else
                ans[i] = st.peek() - i;

            st.push(i);
        }
        return ans;
    }

    static class MinStack {
        private final Stack<Integer> st;
        private final Stack<Integer> min;

        public MinStack() {
            st = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            st.push(val);
            if (min.size() == 0)
                min.push(val);
            else {
                if (min.peek() > val)
                    min.push(val);
            }
        }

        public void pop() {
            int x = st.pop();
            if (x == min.peek())
                min.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] nge = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() != 0 && nums[i] > nums[st.peek()])
                st.pop();
            if (st.size() == 0)
                nge[i] = n;
            else
                nge[i] = st.peek();

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j >= i + k) j = i;
            int max = nums[j];
            while (j < i + k) {
                max = nums[j];
                j = nge[j];
            }
            ans[i] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(0);
        m.push(1);
        m.push(0);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
    }
}
