package String;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int n = s.length();
        char[] str = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int x = map.getOrDefault(str[i],0);
            map.put(str[i],x+1);
        }
        return "";
    }
}
