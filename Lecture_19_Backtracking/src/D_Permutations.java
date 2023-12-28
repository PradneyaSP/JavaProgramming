import java.util.ArrayList;
import java.util.List;

public class D_Permutations {
    private void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] isIncluded) {
        if (curr.size() == nums.length) {
            List<Integer> temp = new ArrayList<>(curr);
            ans.add(temp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!isIncluded[i]) {
                isIncluded[i] = true;
                curr.add(nums[i]);
                helper(nums, ans, curr, isIncluded);
//                Backtracking
                isIncluded[i] = false;
                curr.remove(curr.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] isIncluded = new boolean[nums.length];
        helper(nums, ans, curr, isIncluded);
        return ans;
    }

    public static void main(String[] args) {
        D_Permutations p = new D_Permutations();
        int[] nums = {1, 2, 3};
        System.out.println(p.permute(nums));
    }


}
