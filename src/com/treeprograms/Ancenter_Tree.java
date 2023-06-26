package com.treeprograms;

public class Ancenter_Tree {


    public static Node LowestCommanAncenter(Node root,Node p, Node q){
        if(root==null)
        {
            return null;
        }
        if(root ==p ||root ==q)
        {
            return root;
        }

        Node left=LowestCommanAncenter(root.left,p,q);
        Node right=LowestCommanAncenter(root.right,p,q);

        if(left!=null && right!=null)
        {
            return root;
        }
        if(left!=null) {
            return left;
        }
        else {
            return right;
        }
    }
    public static void main(String[] args) {

        // Level 1
        Node root = new Node(1);

        // Level 2
        root.left = new Node(2);
        root.right = new Node(3);

        // Level 3
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Level 4
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        // Level 5
        root.left.left.left.left = new Node(16);
        root.left.left.left.right = new Node(17);
        root.left.left.right.left = new Node(18);
        root.left.left.right.right = new Node(19);
        root.left.right.left.left = new Node(20);
        root.left.right.left.right = new Node(21);
        root.left.right.right.left = new Node(22);
        root.left.right.right.right = new Node(23);
        root.right.left.left.left = new Node(24);
        root.right.left.left.right = new Node(25);
        root.right.left.right.left = new Node(26);
        root.right.left.right.right = new Node(27);
        root.right.right.left.left = new Node(28);
        root.right.right.left.right = new Node(29);
        root.right.right.right.left = new Node(30);
        root.right.right.right.right = new Node(31);

        Node node6 = new Node(2);
        Node node7 = new Node(3);

        /// I am Not Able to call LowestCommanAncenter method
        //  check my solution on leetcode
        // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/solutions/3684255/ancenter-tree/

        System.out.println(LowestCommanAncenter(root, node6, node7));

    }
}
