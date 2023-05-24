package Linked_List;

public class Linked_List {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int newdata) {
            data = newdata;
            next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    public void insertAtEnd(int newdata) {
        Node newNode = new Node(newdata);

        if (head == null) {
            // If the linked list is empty, make the new node the head
            head = new Node(newdata);
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            // Traverse to the last node
            temp = temp.next;
        }
        // Make the new node the next node of the last node
        temp.next = newNode;
    }

    // Method to insert a new node at the beginning of the linked list
    public void InsertAtBeginning(int newdata) {
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at any index of the linked list
    public void InsertAtAnyway(Node prev_node, int newdata) {
        if (prev_node == null) {
            System.out.println("Cannot contain null value");
            return;
        }

        Node newNode = new Node(newdata);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    // deleting a Node

    void deletelist(int position)
    {   Node temp=head;
        if(head==null)
        {
            return;
        }

        // Deleting not at beginning
        if(position==0)
        {
            head=temp.next;
            return;
        }

        for(int i=0;temp!=null && i<position-1;i++)
        {
            temp=temp.next;
        }
        if(temp==null && temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;

    }

    // Method to display the linked list
    public void displayLink() {
        Node temp = head;
        while (temp != null) {
            // Print the data of each node
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linked_List adde = new Linked_List();
        adde.insertAtEnd(5);
        adde.insertAtEnd(2);
        adde.insertAtEnd(8);
        adde.insertAtEnd(9);
        adde.insertAtEnd(10);
        System.out.println("Before Inserting at the end: ");
        adde.displayLink();
        System.out.println("After Inserting at the end: ");
        adde.insertAtEnd(11);
        adde.displayLink();

        System.out.println("After Inserting 1 at the beginning: ");
        adde.InsertAtBeginning(1);
        adde.displayLink();

        System.out.println("Before Inserting at any location: ");
        adde.displayLink();
        System.out.println("After Inserting at any location: ");
        adde.InsertAtAnyway(adde.head.next.next, 1000);
        adde.displayLink();

        System.out.println("Before Deleting Node: ");
        adde.displayLink();
        adde.deletelist(2);
        System.out.println("After Deleting Node: ");
        adde.displayLink();

    }
}

/*
                                                     ************* IMPORTANT *************


    This code represents a simple implementation of a singly linked list in Java. Here are some comments added for better understanding:
The Linked_List class represents the linked list and contains a reference to the head node.
The Node class is an inner class that represents a node in the linked list. It contains a data field and a reference to the next node.
The insertAtEnd method inserts a new node at the end of the linked list.
The InsertAtBeginning method inserts a new node at the beginning of the linked list.
The InsertAtAnyway method inserts a new node at any specified index in the linked list.
The displayLink method traverses the linked list and prints the data of each node.
In the main method, a new instance of Linked_List is created and various operations are performed on it to demonstrate the functionality of

 */


/*
    ***********************************************************************************************************************************************************



Certainly! Here's an explanation of the code:

1. The `InsertionAtEnd` class represents a linked list. It has a reference to the head of the list.

2. Inside the `InsertionAtEnd` class, there is a nested class `Node` that represents a node in the linked list. Each node has an integer data value and a reference to the next node.

3. The `insertAtEnd` method is used to insert a new node at the end of the linked list. It takes an integer `newdata` as a parameter.

4. If the linked list is empty (i.e., the head is `null`), a new node is created with `newdata` and set as the head of the linked list.

5. If the linked list is not empty, a new node is created with `newdata`. The `next` reference of the new node is set to `null`.

6. A temporary node `temp` is initialized with the value of the head.

7. The while loop is used to traverse the linked list until the last node is reached. This is done by checking if `temp.next` is `null`. If it is not `null`, we move to the next node by updating `temp` with `temp.next`.

8. After the loop ends, `temp` points to the last node of the linked list. The `next` reference of `temp` is updated to point to the new node, effectively inserting the new node at the end of the list.

9. The `displayLink` method is used to print the elements of the linked list. It starts from the head and traverses the list by following the `next` references of each node. The data value of each node is printed.

10. In the `main` method, an instance of `InsertionAtEnd` is created. Several elements are inserted into the linked list using the `insertAtEnd` method. Finally, the `displayLink` method is called to print the elements of the linked list.

The code uses the insertion at the end technique to add elements to the linked list and then displays the list.


 */

/*
In Java, linked list operations involve manipulating a linked list data structure, which is a collection of nodes. Each node contains a data element and a reference (or link) to the next node in the list. Linked lists are dynamic data structures, meaning that their size can change during runtime.

Here are the commonly used linked list operations in Java:

1. Insertion at the beginning: This operation involves creating a new node with the given data and making it the new head of the linked list. It requires updating the next reference of the new node to point to the current head node.

2. Insertion at the end: This operation involves creating a new node with the given data and adding it at the end of the linked list. It requires traversing the list to reach the last node and updating its next reference to point to the new node.

3. Insertion at a specific position: This operation involves creating a new node with the given data and inserting it at a specified position in the linked list. It requires updating the next references of the previous node and the new node to maintain the correct order.

4. Deletion of a node: This operation involves removing a node from the linked list. It can be done by updating the next reference of the previous node to skip the node to be deleted, effectively removing it from the list.

5. Searching for a node: This operation involves traversing the linked list to find a node with a specific value. It requires comparing the data element of each node with the target value until a match is found or the end of the list is reached.

6. Displaying the linked list: This operation involves traversing the linked list and printing the data element of each node. It helps visualize the contents of the list.

These operations can be implemented in various ways, depending on the specific requirements and constraints. The provided code snippet demonstrates a basic implementation of linked list operations in Java.
 */