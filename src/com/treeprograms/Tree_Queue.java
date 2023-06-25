package com.treeprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree_Queue {
    public static ArrayList<Integer> levelorder(Node root){
        ArrayList<Integer> ans =new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            Node n=q.remove();
            ans.add(n.val);

            if(n.left!=null)
            {
                q.add(n.left);
            }
            if(n.right!=null)
            {
                q.add(n.right);
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.print(levelorder(root)+" ");


    }
}
