import java.util.*;

public class K_Subsets {
    private void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] isIncluded, int idx) {
        int n = nums.length;
        for (int i = idx; i < n; i++) {
            if (!isIncluded[i]) {
                curr.add(nums[i]);
                isIncluded[i] = true;
                ans.add(new ArrayList<>(curr));
                System.out.println(idx + " " + curr + " " + Arrays.toString(isIncluded));
                helper(nums, ans, curr, isIncluded, i + 1);
                isIncluded[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        ans.add(curr);
        boolean[] isIncluded = new boolean[nums.length];
        helper(nums, ans, curr, isIncluded, 0);
        return ans;
    }

    public static void main(String[] args) {
        K_Subsets s = new K_Subsets();
        int[] nums = {1, 2, 3};
        System.out.println(s.subsets(nums));
    }
}
