import java.util.Stack;

public class Queue_using_Stack {
    static Stack<Integer> stacka = new Stack<>();
    static Stack<Integer> stackb = new Stack<>();

    // Function to enqueue (add) an element to the queue
    static void enqueue(int data) {
        stacka.push(data);
    }

    // Function to dequeue (remove) an element from the queue
    static int dequeue() {
        int ele;
        if (stacka.empty() && stackb.empty()) {
            System.out.println("Queue is Empty");
            System.exit(0);
        }

        // Push all elements from stacka to stackb
        if (stackb.empty()) {
            while (!stacka.empty()) {
                ele = stacka.pop();
                stackb.push(ele);
            }
        }

        // Pop the element from stackb (which is the oldest element in the queue)
        ele = stackb.pop();
        return ele;
    }

    public static void main(String[] args) {
        Queue_using_Stack q = new Queue_using_Stack();

        // Enqueue elements to the queue
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        // Dequeue and print elements from the queue
        System.out.println("Deleted element is " + q.dequeue());
        System.out.println("Deleted element is " + q.dequeue());
    }
}

/*
Explanation:

The code defines a class called Queue_using_Stack.

Two static stacks (stacka and stackb) are declared to implement the queue. stacka is used to enqueue elements, and stackb is used to dequeue elements.

The enqueue() function is used to add an element to the queue. It simply pushes the element onto stacka.

The dequeue() function is used to remove and return the oldest element from the queue. If both stacka and stackb are empty, it means the queue is empty, so it displays an error message and exits the program.

If stackb is empty, it transfers all the elements from stacka to stackb. This step ensures that the oldest element in the queue is at the top of stackb.

Finally, the function pops the top element from stackb and returns it as the dequeued element.

In the main() method, an instance of Queue_using_Stack is created.

Elements are enqueued to the queue using the enqueue() method.

Elements are dequeued from the queue using the dequeue() method, and the deleted elements are printed.
 */