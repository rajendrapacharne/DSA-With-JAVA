package com.treeprograms;

public class Tree_P_BFS {

    // Method to calculate the height of the tree
    public static int height(Node root){
        if(root==null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public static void main(String[] args) {

        // Creating the tree nodes
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        // Performing level order traversal of the tree
        levelordertravelsal(root);
    }

    private static void levelordertravelsal(Node root) {
        int level = 1;
        while (printlevel(root, level)) {
            level++;
        }
    }

    // Method to print the nodes at a specific level in the tree
    private static boolean printlevel(Node root, int level) {
        if (root == null) {
            return false;
        }
        if (level == 1) {
            // Print the value of the current node
            System.out.print(root.val + " ");
            return true;
        }
        // Recursively call printlevel on the left and right subtrees with level-1
        boolean left = printlevel(root.left, level - 1);
        boolean right = printlevel(root.right, level - 1);

        // Return true if either the left or right subtree has nodes at the current level
        return (left || right);
    }
}
