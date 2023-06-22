class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Binary_Tree {
    Node root;

    Binary_Tree(int key) {
        root = new Node(key);
    }

    Binary_Tree() {
        root = null;
    }

    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();

        // Create a sample binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree:");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal of binary tree:");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal of binary tree:");
        tree.printPostorder(tree.root);
    }

    // Preorder traversal: root -> left -> right
    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " "); // Print the data of the current node
        printPreorder(node.left); // Recursively traverse the left subtree
        printPreorder(node.right); // Recursively traverse the right subtree
    }

    // Inorder traversal: left -> root -> right
    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left); // Recursively traverse the left subtree
        System.out.print(node.data + " "); // Print the data of the current node
        printInorder(node.right); // Recursively traverse the right subtree
    }

    // Postorder traversal: left -> right -> root
    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left); // Recursively traverse the left subtree
        printPostorder(node.right); // Recursively traverse the right subtree
        System.out.print(node.data + " "); // Print the data of the current node
    }
}
