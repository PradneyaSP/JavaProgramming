import java.util.LinkedList;
import java.util.Queue;

public class B_ConstructTree {
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

    public static void bfs(TreeNode root) {
        int level = heightTree(root);
        for (int i = 0; i < level; i++) {
            nthLevel(root, i);
            System.out.println();
        }
    }

    //    Finding the height of Binary Tree
    public static int heightTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
    }

    //    Printing the nth level
    private static void nthLevel(TreeNode root, int n) {
        if (root == null) return;
        if (n == 0) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    public static TreeNode constructTree(String[] arr) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for (int i = 1; i < arr.length - 1 && q.size() > 0; i = i + 2) {
            TreeNode temp;
            temp = q.remove();
            if (arr[i] != null) {
                temp.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(temp.left);
            } else temp.left = null;
            if (arr[i + 1] != null) {
                temp.right = new TreeNode(Integer.parseInt(arr[i + 1]));
                q.add(temp.right);
            } else temp.right = null;
        }

        return root;
    }

    public static void main(String[] args) {
        String[] str = {"1", "2", "3", "4", "5", null, "6", null, "7", null, null, "8", null, null, null, "9", null};
        TreeNode root = constructTree(str);
        bfs(root);
    }


}
