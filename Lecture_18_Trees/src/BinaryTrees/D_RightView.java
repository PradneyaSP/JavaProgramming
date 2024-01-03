package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class D_RightView {
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

    static int lvl;
    private void helper(TreeNode root , List<Integer> ans , int i) {
        if(root == null)return;
        ans.set(i,root.val);
        helper(root.left , ans , i+1);
        helper(root.right , ans , i+1);
    }

    private int level(TreeNode root){
        if(root == null ) return 0;
        return 1 + Math.max(level(root.left) , level(root.right));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        lvl = level(root);

        for(int i = 0 ; i < lvl ; i++ )
            ans.add(-1);

        helper(root , ans , 0);
        return ans;
    }
}
