package BinaryTree;

import java.util.ArrayList;

public class TopView {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void inorder(Node root, int pos, ArrayList<Integer> ans, ArrayList<Integer> visited) {
        if (root == null) return;
        inorder(root.left, pos - 1, ans, visited);
        if (!visited.contains(pos)) {
            ans.add(root.data);
            visited.add(pos);
        }
        inorder(root.right, pos + 1, ans, visited);
    }

    static ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        inorder(root, 0, ans, visited);
        return ans;
    }
}
