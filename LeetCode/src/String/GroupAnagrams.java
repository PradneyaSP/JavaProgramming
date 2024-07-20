package String;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        String[] newStrs = new String[n];

        for(int i = 0 ; i < n ; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            newStrs[i] = String.copyValueOf(str);
        }
//        Each key refers to the sorted string and value refers to the position in the ans list
        System.out.println(Arrays.toString(strs));
        Map<String,Integer> map = new HashMap<>();
        int k = 0;
        for(int i= 0 ; i < n ; i++){
            String str = newStrs[i];
            int idx = map.getOrDefault(str,-1);

            if(idx==-1){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.add(temp);
                map.put(str,k);
                k++;
            }
            else{
                ans.get(idx).add(strs[i]);
            }
        }
        return ans;
    }
}
