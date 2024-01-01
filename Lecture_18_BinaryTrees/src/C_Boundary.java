import java.util.LinkedList;
import java.util.Queue;

public class C_Boundary {
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
//    [1, 2, 3, 4, 5, null, 6, 7, null, 8, null, 9, 10, null, 11, null, 12, null, 13, null, 14, 15, 16, null, 17, null, null, 18, null, 19, null, null, null, 20, 21, 22, 23, null, 24, 25, 26, 27, null, null, 28, null, null];
    public static void main(String[] args) {
        String[] str = {"1", "2", "3", "4", "5", null, "6", "7", null, "8", null, "9", "10", null, "11", null, "12", null, "13", null, "14", "15", "16", null, "17", null, null, "18", null, "19", null, null, null, "20", "21", "22", "23", null, "24", "25", "26", "27", null, null, "28", null, null};
        TreeNode root = constructTree(str);

        boundary(root);
    }

    private static void boundary(TreeNode root) {
        leftBoundary(root);
        leaves(root);
        rightBoundary(root.right);
    }

    private static void leftBoundary(TreeNode root) {
        if (root == null) return;
        if (root.right == null && root.left == null) return;
        System.out.print(root.val + " ");
        if (root.left != null) leftBoundary(root.left);
        else leftBoundary(root.right);
    }


    private static void leaves(TreeNode root) {
        if (root == null) return;
        if (root.right == null && root.left == null) {
            System.out.print(root.val + " ");
            return;
        }
        leaves(root.left);
        leaves(root.right);
    }

    private static void rightBoundary(TreeNode root) {
        if (root == null) return;
        if (root.right == null && root.left == null) return;
        if (root.right != null) rightBoundary(root.right);
        else rightBoundary(root.left);
        System.out.print(root.val + " ");
    }

}
