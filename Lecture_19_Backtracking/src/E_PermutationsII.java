import java.util.ArrayList;
import java.util.List;

//For duplicates
public class E_PermutationsII {
    private void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void helper(int[] nums, List<List<Integer>> ans, int idx) {
        if (idx == nums.length -1) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            if(!ans.contains(temp))
                ans.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(i , idx , nums);
            helper(nums , ans , idx+1);
            swap(idx , i , nums);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, 0);
        return ans;
    }
}
