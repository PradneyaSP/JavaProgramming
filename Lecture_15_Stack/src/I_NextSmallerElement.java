import java.util.Arrays;
import java.util.Stack;

public class I_NextSmallerElement {
    public static int[] nextSmallerInteger(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i = heights.length-1 ; i>=0 ; i--){
            while(st.size() != 0 && heights[i] <= heights[st.peek()])
                st.pop();
            if(st.size() == 0)
                ans[i] = heights.length;
            else
                ans[i] = st.peek();

            st.push(i);
        }
        return ans;
    }

    public static int[] previousSmallerInteger(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans =  new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            while(st.size() != 0 && heights[i] <= heights[st.peek()])
                st.pop();
            if(st.size() == 0)
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] nse = nextSmallerInteger(heights);
        System.out.println(Arrays.toString(nse));
        int[] pse = previousSmallerInteger(heights);
        System.out.println(Arrays.toString(pse));
        int[]areas = new int[heights.length];
        int max = 0;

        for(int i = 0 ; i < heights.length ; i++){
            int width = nse[i] - pse[i] -1;
            areas[i] = heights[i] * width;
            max = Math.max(max,areas[i]);
        }
        System.out.println(Arrays.toString(areas));

        return max;
    }

    public static void main(String[] args) {
        int[] heights = {1,1};
        System.out.println(largestRectangleArea(heights));
    }
}
