package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversalBottomUp {
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

    List<List<Integer>> temp = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(root,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = temp.size()-1 ; i >=0 ; i--){
            ans.add(temp.get(i));
        }
        return ans;
    }

    public void helper(TreeNode root , int level){
        if(root == null) return;
        if(level == temp.size()) temp.add(new ArrayList<>());
        temp.get(level).add(root.val);
        helper(root.left,level+1);
        helper(root.right,level+1);

    }
}
