package BinaryTrees;

import java.util.*;

public class A_Intro {
/*
Trees : Non-Liner , Hierarchical Data Structure

Terminologies:  Node -> Each component of a Tree is called a Node
                Root Node -> The ultimate Node from which the tree starts
                Child Node -> The nodes which are under a particular node and directly connected to it.
                Sibling Node -> Nodes with same parent
                Leaf Node-> Nodes with no child
                Internal Node -> Nodes which are neither leaf nor root
                Ancestor Nodes -> Travel up the tree to root. All the nodes encountered are ancestors
                Descendant Nodes -> Travel Down the tree from a particular Node.
                Level -> Root Node is at level 0 , Its direct descendants are at Level 2 and so on
                Height -> Root Node is at max height , Leaf is at 0 height
                Depth -> Depth of a Node is equal to the level
                Subtree -> It is the smaller tree whose parent is the child node
Note: Each Node can only have 1 parent and can have multiple children
    : Traversing is done by BFS and DFS
    : No loops and circuits
    : NO self looping
Types of Trees :    1.Generic Trees
                    2.Binary Trees -> Each node can have atmost 2 children (left & right child)
                    3.Binary Search Tree -> Binary Tree where left child < parent < right child
                    4.AVL Tress -> Balanced BST
 */

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;
        }
    }

    //      Preorder Traversal (root left right)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //    Postorder Traversal (left right root)
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    //    Inorder Traversal (left root right)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    //    Finding the size of Tree
    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    //    Finding the max value in a tree
    public static int maxNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    //    Finding the height of Binary Tree
    public static int heightTree(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
    }

    //    Printing the nth level
    public static void nthLevel(Node root, int n) {
        if (root == null) return;
        if (n == 0) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    //        Breadth - First - Search or Level Order Traversal
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.right != null) q.add(temp.right);
            if (temp.left != null) q.add(temp.left);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    public static void bfs2(Node root) {
        int level = heightTree(root);
        for (int i = 0; i < level; i++) {
            nthLevel(root, i);
            System.out.println();
        }
    }

    //    DFS Traversals
    public static void inorderDFS(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        st.push(root);
        while (st.size() > 0) {
            Node temp = st.peek();
            if (temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            } else {
                System.out.println(temp.val + " ");
                st.pop();
                if (temp.right != null) st.push(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
//        Assigning children of root
        root.left = a;
        root.right = b;
//        Assigning children of a
        a.left = c;
        a.right = d;
//        Assigning children of b
        b.left = null;
        b.right = e;
//        Displaying the tree
        System.out.println("The entered tree is : ");
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

//        Finding the size of tree
        System.out.println("The size of Tree is : " + size(root));

//        Max value of Tree
        System.out.println("The max value of Tree is : " + maxNode(root));

//        Height of Tree
        System.out.println("The height of Tree is : " + heightTree(root));

//        Printing the nodes at nth level
        int n = 2;
        System.out.print("The nodes at " + n + "th level of Tree is : ");
        nthLevel(root, n);

//        BFS Traversal
        System.out.print("\nBFS : ");
        bfs(root);
    }
}
