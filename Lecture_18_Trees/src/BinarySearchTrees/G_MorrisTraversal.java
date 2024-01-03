package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class G_MorrisTraversal {
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

    public List<Integer> morrisTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr)
                    pred = pred.right;

                if(pred.right == curr){
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
                else {
                    pred.right = curr;
                    curr = curr.left;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}
