import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Implementation {
    public static void main(String[] args) {
        // Create a new deque

        Deque<Integer> dq = new ArrayDeque<>();

        // Add elements to the front of the deque
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);

        // Print the deque after adding elements to the front
        System.out.println("Deque after adding elements to the front: " + dq);

        // Add elements to the end of the deque
        dq.addLast(11);
        dq.addLast(12);
        dq.addLast(13);

        // Print the deque after adding elements to the end
        System.out.println("Deque after adding elements to the end: " + dq);

        // Remove the last element from the deque
        dq.removeLast();

        // Print the deque after removing the last element
        System.out.println("Deque after removing the last element: " + dq);

        // Remove the first element from the deque
        dq.removeFirst();

        // Print the deque after removing the first element
        System.out.println("Deque after removing the first element: " + dq);
    }
}
