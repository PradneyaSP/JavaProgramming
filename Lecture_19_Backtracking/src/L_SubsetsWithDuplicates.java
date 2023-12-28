import java.util.*;

public class L_SubsetsWithDuplicates {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, ans, curr, 0);
        return ans;
    }

    private void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, int idx) {
        int n = nums.length;
        ans.add(new ArrayList<>(curr));
        for (int i = idx; i < n; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            helper(nums, ans, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        L_SubsetsWithDuplicates s = new L_SubsetsWithDuplicates();
        int[] nums = {1, 2, 2};
        System.out.println(s.subsetsWithDup(nums));
    }
}
