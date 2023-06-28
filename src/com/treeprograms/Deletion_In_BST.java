package com.treeprograms;

public class Deletion_In_BST {
    public static TreeNode getMin(TreeNode curr)
    {
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
    public static TreeNode deleteNode(TreeNode root, int key)
    {
        TreeNode parent = null;
        TreeNode curr = root;

        while (curr != null && curr.val != key) {
            parent = curr;

            if (key < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (curr == null) {
            return root;
        }

        if (curr.left == null && curr.right == null) {
            if (curr == root) {
                root = null;
            } else {
                if (parent.left == curr) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        }

        else if(curr.left==null || curr.right==null)
        {
            TreeNode child;
            if(curr.left!=null)
            {
                child=curr.left;
            }
            else
            {
                child=curr.right;
            }
            if(curr==root)
            {
                root=child;
            }
            else{
                if(curr==parent.left)
                {
                    parent.left=child;
                }
                else
                {
                    parent.right=child;
                }
            }
        }
        else
        {
            TreeNode min=getMin(curr.right);
            int minval=min.val;
            deleteNode(root,minval);
            curr.val=minval;
        }
        return root;
    }
    public static void printBST(TreeNode root) {
        if (root != null) {
            printBST(root.left);
            System.out.print(root.val + " ");
            printBST(root.right);
        }
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(30);

        System.out.println("Before Deletion ");
        printBST(root);
        deleteNode(root,5);
        System.out.println();
        System.out.println("after Deletion");
        printBST(root);


    }
}
class TreeNode
{
    int  val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int val)
    {
        this.val=val;
    }

}
