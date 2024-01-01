import java.util.Arrays;

public class E_BinaryTreeFromInorderAndPreorder {
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

    public TreeNode helper(int[] preorder, int preLo, int preHi, int[] inorder, int inLo, int inHi) {
        if(preLo > preHi) return null;
        int x = preorder[preLo];
        TreeNode root = new TreeNode(x);
        int idx = inLo;
        while (inorder[idx] != preorder[preLo] && idx < inHi) idx++;
        int y = idx - inLo;
        root.left = helper(preorder, preLo + 1 , preLo + y , inorder , inLo , idx -1  );
        root.right = helper(preorder, preLo + y  + 1 , preHi , inorder , idx+1 , inHi );
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
}
