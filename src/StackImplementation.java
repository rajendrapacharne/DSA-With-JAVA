import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        // Creating a stack using the Stack class from Java's collections
        Stack<Integer> stackdata = new Stack<>();

        // Pushing elements onto the stack
        stackdata.push(2);
        stackdata.push(4);
        stackdata.push(6);
        stackdata.push(9);

        // Printing the topmost element before deletion using the peek() method
        System.out.println("Topmost element before deletion in stack: " + stackdata.peek());

        // Removing the topmost element from the stack using the pop() method
        stackdata.pop();

        // Printing the topmost element after deletion
        System.out.println("Topmost element after deletion in stack: " + stackdata.peek());

        // Searching for an element in the stack using the search() method
        System.out.println("Position of element 4 in stack: " + stackdata.search(4));

        // Searching for an element not present in the stack
        System.out.println("Position of element 1 in stack: " + stackdata.search(1));

        // Checking if the stack is empty using the empty() method
        System.out.println("Is the stack empty? " + stackdata.empty());


    }
}
