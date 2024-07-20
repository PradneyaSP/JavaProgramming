import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TB_RussianDollEnvelopes {
    public int lowerBound(List<Integer>a , int target){
        int n = a.size();
        int low = 0;
        int high = n-1;
        int mid = low + (high-low)/2;
        while(low <= high){
            if(a.get(mid) == target)
                return mid;
            else if (target > a.get(mid))
                low = mid + 1;
            else
                high = mid-1;
            mid = low + (high-low)/2;
        }
        return mid;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer>  ans = new ArrayList<Integer>();
        ans.add(nums[0]);
        int index=0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > ans.get(ans.size()-1))
                ans.add(nums[i]);
            else{
                index = lowerBound(ans,nums[i]);
                ans.set(index,nums[i]);}
        }
        return ans.size();
    }

    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes, (arr1, arr2) -> {
            if(arr1[0] == arr2[0])
                return arr2[1] - arr1[1];
            else
                return arr1[0] - arr2[0];
        });
        int[] height = new int[n];
        for(int i = 0 ; i < n  ;i ++){
            height[i] = envelopes[i][1];
        }
        return lengthOfLIS(height);
    }
}
