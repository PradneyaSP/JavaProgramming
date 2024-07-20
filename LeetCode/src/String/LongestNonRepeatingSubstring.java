package String;

import java.util.ArrayDeque;
import java.util.Queue;

public class LongestNonRepeatingSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0 , max = 0;
        int[] freq = new int[26];
        Queue<Character> queue = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            if(freq[idx] == 0) {
                freq[idx]++;
                count++;
                queue.add(ch);
            }
            else {
                while(queue.size() >0  && queue.peek() != ch) {
                    char del = queue.remove();
                    freq[del] = 0;
                }
                System.out.println(queue);
                count = queue.size();
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
