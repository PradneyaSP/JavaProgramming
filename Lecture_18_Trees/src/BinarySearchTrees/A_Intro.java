package BinarySearchTrees;

public class A_Intro {
    /*
        A BST is a BINARY TREE such that :
        1. EVERY node to the LEFT of a given node is SMALLER than the given node
        2. EVERY node to the RIGHT of a given node is GREATER than the given node

        Advantages : 1. Efficient Searching
                     2. Efficient Insertion and Deletion
                     3. Used in priority Queues , Maps, Sets etc

       Disadvantages : 1. Lack of support for ranged queries
                       2. Not that efficient in Unbalanced Trees

       NOTE : Inorder traversal of any BST will always give you a sorted array.
    */
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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (val < root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public TreeNode inorderSuccessor(TreeNode root) {
        if (root.left == null) return root;
        return inorderSuccessor(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        else if (root.val == key) {
            if (root.left == null && root.right == null) return null;
            else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode temp = inorderSuccessor(root.right);
                int tempVal = temp.val;
                temp.val = root.val;
                root.val = tempVal;
                root.right = deleteNode(root.right, key);
            }
        } else if (key < root.val) root.left = deleteNode(root.left, key);
        else root.right = deleteNode(root.right, key);
        return root;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        A_Intro bst = new A_Intro();
        TreeNode root = null;

        root = bst.insertIntoBST(root, 50);
        root = bst.insertIntoBST(root, 20);
        root = bst.insertIntoBST(root, 60);
        root = bst.insertIntoBST(root, 17);
        root = bst.insertIntoBST(root, 34);
        root = bst.insertIntoBST(root, 55);
        root = bst.insertIntoBST(root, 89);
        root = bst.insertIntoBST(root, 10);
        root = bst.insertIntoBST(root, 28);
        root = bst.insertIntoBST(root, 70);
        root = bst.insertIntoBST(root, 14);

        bst.inorder(root);
        System.out.println();
        bst.deleteNode(root, 14);
        bst.deleteNode(root, 50);

        bst.inorder(root);
    }
}
