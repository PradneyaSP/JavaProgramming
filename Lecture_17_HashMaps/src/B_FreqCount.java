import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class B_FreqCount {
    public static int maxFrequency(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int x : arr) {
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x)+1);
            }
            else {
                mp.put(x,1);
            }
        }
        int maxFreq = -1;
        int ansKey = -1;
        System.out.println(mp.entrySet());
        for(var x:mp.keySet()) {
            if (mp.get(x) > maxFreq) {
                maxFreq = mp.get(x);
                ansKey = x;
            }
        }

        return ansKey;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,3,3,3,5,6,4,2,3};
        System.out.println(maxFrequency(arr));
    }
}
