package BinaryTrees;

import java.util.*;

public class F_PathSumOne {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void findPath(TreeNode root, int targetSum, int currSum, List<List<Integer>> ans, List<Integer> curr) {
        if (root == null) return;
        currSum += root.val;
        curr.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum == currSum) {
                ans.add(new ArrayList<>(curr));
                curr.remove(curr.size() - 1);
                return;
            }
        }
        findPath(root.left, targetSum, currSum, ans, curr);
        findPath(root.right, targetSum, currSum, ans, curr);
        curr.remove(curr.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findPath(root, targetSum, 0, ans, curr);
        return ans;
    }
}
