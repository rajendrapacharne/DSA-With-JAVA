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