package com.treeprograms;
public class Tree_P {


    public static int height(Node root){
        if(root==null)
        {
            return 0;
        }
        else {
            return 1+ Math.max(height(root.left),height(root.right));
        }
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Height of tree  is "+height(root));


    }
}
class Node
{
    int  val;
    Node left=null;
    Node right=null;
    Node(int val)
    {
        this.val=val;
    }

}
