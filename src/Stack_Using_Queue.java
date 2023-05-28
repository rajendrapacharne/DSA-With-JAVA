import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Queue {
    static Queue<Integer> q1 = new LinkedList(); // First queue
    static Queue<Integer> q2 = new LinkedList(); // Second queue

    static void add(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek()); // Move elements from q1 to q2
            q1.poll();
        }
        q1.add(data); // Add the new element to q1
        while (!q2.isEmpty()) {
            q1.add(q2.peek()); // Move elements back from q2 to q1
            q2.poll();
        }
    }

    static int removee() {
        if (q1.isEmpty()) {
            System.out.println("Queue Overflow");
            System.exit(0);
        }

        int ele = q1.peek(); // Get the top element from q1
        q1.poll(); // Remove the top element from q1
        return ele;
    }

    public static void main(String[] args) {
        Stack_Using_Queue s = new Stack_Using_Queue();
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);

        System.out.println("Deleted element from stack is " + s.removee());
    }
}

/*
Two queues, q1 and q2, are declared as static variables in the Stack_Using_Queue class.

The add method is used to add elements to the stack implemented using queues. The logic is as follows:

First, all elements from q1 are moved to q2 one by one.
Then, the new element is added to q1.
Finally, all elements from q2 are moved back to q1.
The removee method is used to remove an element from the stack. If q1 is empty, it means the stack is underflow and an error message is displayed.

In the main method, an instance of Stack_Using_Queue is created.

Elements 2, 5, 9, and 12 are added to the stack using the add method.
The removee method is called to remove the top element from the stack, and it is printed to the console.

 */