package com.treeprograms;

public class BST_Tree {

    private static boolean check(Node root, Long min, Long max)
    {
        if(root==null)
            return true;
        if(root.val<=min || root.val>=max)
            return false;
        return check(root.left,min, (long) root.val) && check(root.right, (long) root.val,max);
    }
    private static boolean isvalidBST(Node root)
    {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(19);
        root.right=new Node(15);

        System.out.println(isvalidBST(root));


    }
}

