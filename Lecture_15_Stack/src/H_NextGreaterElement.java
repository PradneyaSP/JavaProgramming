import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class H_NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.size() == 0) {
                st.push(arr[i]);
                continue;
            }
            while (st.size() != 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0)
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(arr[i]);
        }
        return res;
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            max = Math.max(num, max);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (st.size() != 0 && nums[i] > st.peek())
                st.pop();

            if (st.size() == 0) {
                if (nums[i] == max) {
                    ans[i] = -1;
                    st.push(nums[i]);
                    continue;
                } else {
                    for (int j = 0; j < i; j++) {
                        if (nums[i] < nums[j]) {
                            ans[i] = nums[j];
                            break;
                        }
                    }
                }
            } else
                ans[i] = st.peek();
            st.push(nums[i]);
            System.out.println(st);
        }
        return ans;
    }

    static class StockSpanner {
        Stack<Integer> st;
        ArrayList<Integer> prices;
        int index = 0;

        public StockSpanner() {
            st = new Stack<>();
            prices = new ArrayList<>();
        }

        public int next(int price) {
            int ans;
            while (st.size() != 0 && price > prices.get(st.peek()))
                st.pop();

            if(st.size() == 0){
                ans = index+1;
            }
            else {
                ans = index-st.peek();
            }

            prices.add(price);
            st.push(index);
            index++;
            return ans;
        }
    }

    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();
//        [[],[31],[41],[48],[59],[79]]
//        [null,1,2,3,4,5]
        System.out.println(s.next(31));
        System.out.println(s.next(41));
        System.out.println(s.next(48));
        System.out.println(s.next(59));
        System.out.println(s.next(79));
    }
}
