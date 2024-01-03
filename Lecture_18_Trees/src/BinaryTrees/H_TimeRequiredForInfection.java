package BinaryTrees;

import java.util.*;

public class H_TimeRequiredForInfection {
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

    public int amountOfTime(TreeNode root, int start) {
        TreeNode node = getNode(root, start);
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        preorder(root, parent);

        //BFS
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> infected = new HashMap<>();
        q.add(node);
        infected.put(node, 0);
        while (q.size() > 0) {
            TreeNode temp = q.peek();
            int time = infected.get(temp);
            if (temp.left != null && !infected.containsKey(temp.left)) {
                q.add(temp.left);
                infected.put(temp.left, time + 1);
            }
            if (temp.right != null && !infected.containsKey(temp.right)) {
                q.add(temp.right);
                infected.put(temp.right, time + 1);
            }
            if (parent.containsKey(temp) && !infected.containsKey(parent.get(temp))) {
                q.add(parent.get(temp));
                infected.put(parent.get(temp), time + 1);
            }
            q.remove();
        }
        int max = -1;
        for (int val : infected.values()) {
            max = Math.max(max, val);
        }
        return max;
    }

    public TreeNode getNode(TreeNode root, int start) {
        if (root == null) return null;
        if (root.val == start) return root;
        TreeNode left = getNode(root.left, start);
        TreeNode right = getNode(root.right, start);
        if (left == null) return right;
        else return left;
    }

    private void preorder(TreeNode root, Map<TreeNode, TreeNode> parent) {
        if (root == null) return;
        if (root.left != null) parent.put(root.left, root);
        if (root.right != null) parent.put(root.right, root);
        preorder(root.left, parent);
        preorder(root.right, parent);
    }
}
