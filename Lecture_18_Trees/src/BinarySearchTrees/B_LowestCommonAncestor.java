package BinarySearchTrees;

public class B_LowestCommonAncestor {
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
    public int comparePositions(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return 0;
        int currVal = root.val;
        if((p.val <= currVal && q.val >= currVal) ||( p.val >= currVal && q.val <= currVal))
            return 0;
        else if(p.val > currVal && q.val > currVal)
            return 1;
        else
            return -1;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(comparePositions(root , p , q) == 0)
            return root;
        else if (comparePositions(root , p , q) == 1)
            return lowestCommonAncestor(root.right , p , q);
        else
            return lowestCommonAncestor(root.left , p , q);
    }
}
