package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static class TreeNode {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        TreeNode temp = root;
        Queue<TreeNode> curr = new ArrayDeque<>();
        Queue<TreeNode> next = new ArrayDeque<>();

        curr.add(temp);
        while (!curr.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            while (!curr.isEmpty()) {
                temp = curr.remove();
                level.add(temp.val);
                if (temp.left != null)
                    next.add(temp.left);
                if (temp.right != null)
                    next.add(temp.right);
            }
            ans.add(level);
            while (!next.isEmpty())
                curr.add(next.remove());
        }
        return ans;
    }

}
