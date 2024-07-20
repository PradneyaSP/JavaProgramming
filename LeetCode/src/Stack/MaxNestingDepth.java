package Stack;

import java.util.Stack;

public class MaxNestingDepth {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(')
                count++;
            else if(ch == ')')
                count--;
            max = Math.max(max,count);
        }
        return  max;
    }
}
