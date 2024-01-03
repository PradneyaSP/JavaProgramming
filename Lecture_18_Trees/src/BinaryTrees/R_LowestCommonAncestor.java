package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class R_LowestCommonAncestor {
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

    int findSubtree(int n, TreeNode root, String subtree) {
        if (root == null)
            return 0;
        if (root.val == n) {
            if (subtree.equals("Left"))
                return -1;
            if (subtree.equals("Right"))
                return 1;
            else
                return 0;
        }
        return findSubtree(n, root.left, "Left") + findSubtree(n, root.right, "Right");
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = new TreeNode();
        temp = root;
        int pTree = findSubtree(p.val , root , "");
        int qTree = findSubtree(q.val , root , "");

        if(qTree == 0)
            return q;
        if(pTree == 0)
            return p;

        while (pTree + qTree != 0) {
            if (pTree == -1 && qTree == -1) {
                System.out.println(pTree + " " + qTree);
                temp = root.left;
                pTree = findSubtree(p.val , temp , "Left");
                qTree = findSubtree(q.val , temp , "Left");
            }
            if(pTree == 1 && qTree == 1) {
                temp = root.right;
                pTree = findSubtree(p.val , temp , "Right");
                qTree = findSubtree(q.val , temp , "Right");
            }
        }
        return temp;
    }

}
