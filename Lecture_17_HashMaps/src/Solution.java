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
}
