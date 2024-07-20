package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int x = map.get(ch);
            char nextCh = s.charAt(i - 1);
            int y = map.get(nextCh);
            if (x > y){
                ans += x-y;
            }
            else{
                ans += x;
            }
        }
        return ans;
    }
}
