package com.treeprograms;


public class Insertion_in_BST_Tree {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node InsertIntoBST(Node root, int val) {
        if (root == null) {
            Node n1 = new Node(val);
            return n1;
        }
        if (val < root.val) {
            root.left = InsertIntoBST(root.left, val);
        } else {
            root.right = InsertIntoBST(root.right, val);
        }

        return root;
    }

    public static void printBST(Node root) {
        if (root != null) {
            printBST(root.left);
            System.out.print(root.val + " ");
            printBST(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(25);

        InsertIntoBST(root, 20);
        InsertIntoBST(root, 7);
        InsertIntoBST(root, 21);
        printBST(root);
    }
}
