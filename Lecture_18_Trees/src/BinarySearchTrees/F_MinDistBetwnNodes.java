package BinarySearchTrees;

public class F_MinDistBetwnNodes {
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

    static int min = Integer.MAX_VALUE;

    // Morris Traversal
    public int inPred(TreeNode root) {
        if (root == null) return 0;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
    // Morris Traversal
    public int inSucc(TreeNode root) {
        if (root == null) return 0;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        if (root.right != null) min = Math.min(min, inSucc(root.right) - root.val);
        if (root.left != null) min = Math.min(min, root.val - inPred(root.left));
        helper(root.left);
        helper(root.right);

    }

    public int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        helper(root);
        return min;
    }
}
