package com.treeprograms;

public class MaxpathSum {

    private static int max = Integer.MIN_VALUE;

    private static int helper(Node root) {
        if (root == null)
            return 0;

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        max = Math.max(max, root.val + left + right);

        return root.val + Math.max(left, right);
    }


    ///

    public static int sumOfMaxPath(Node root) {
        helper(root);
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sumOfMaxPath(root));
    }
}
