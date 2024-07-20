import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;

        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < magazine.length();i++){
            char c = magazine.charAt(i);
            if(mp.containsKey(c))
                mp.put(c,mp.get(c)+1);
            else
                mp.put(c,1);
        }

        for(int i = 0 ; i < ransomNote.length() ;i++){
            char ch = ransomNote.charAt(i);
            if(mp.containsKey(ch) && mp.get(ch) > 0)
                mp.put(ch,mp.get(ch)-1);
            else
                return false;
        }

        return true;
    }
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : jewels.toCharArray())
            mp.put(c,0);

        for(char c : stones.toCharArray()){
            if(mp.containsKey(c))
                mp.put(c,mp.get(c)+1);
        }

        int count = 0;
        for(int i : mp.values())
            count+=i;

        return count;
    }

    public int minSteps(String s, String t) {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        for(char c  : s.toCharArray()){
            int k = sMap.getOrDefault(c,0);
            sMap.put(c,k+1);
        }

        for(char c  : t.toCharArray()){
            int k = tMap.getOrDefault(c,0);
            tMap.put(c,k+1);
        }

        int ans = 0;
        for(char c : sMap.keySet()){
            int x = sMap.get(c);
            int y = tMap.getOrDefault(c,0);
            ans += x-y;
        }
        return ans;
    }
}
