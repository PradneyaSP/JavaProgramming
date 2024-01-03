package BinarySearchTrees;

public class D_CreateBST {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return insertIntoBST(nums, 0, nums.length - 1);
    }

    public TreeNode insertIntoBST(int[] nums, int l, int h) {
        if (l > h)
            return null;
        int mid = (l + h) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertIntoBST(nums, l, mid - 1);
        root.right = insertIntoBST(nums, mid + 1, h);
        return root;
    }
}
