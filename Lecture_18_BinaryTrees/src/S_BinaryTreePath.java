import java.util.*;

public class S_BinaryTreePath {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    private void helper(TreeNode root, List<String> ans, String curr) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            curr += root.val;
            ans.add(curr);
            return;
        }
        helper(root.left, ans, curr + root.val + "->");
        helper(root.right, ans, curr + root.val + "->");
    }
}
