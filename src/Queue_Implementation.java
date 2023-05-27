import java.util.LinkedList;
import java.util.Queue;

public class Queue_Implementation {
    public static void main(String[] args) {
        // Create a new queue using LinkedList implementation
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        // Print the contents of the queue
        System.out.println("Data in Q is " + q);

        // Retrieve the topmost element in the queue without removing it
        System.out.println("Topmost element in Queue is Before  " + q.peek());

        // Remove the topmost element from the queue
        q.remove();

        // Retrieve the new topmost element in the queue
        System.out.println("Topmost element in Queue is after  " + q.peek());

        // Get the size of the queue
        System.out.println("Size of queue: " + q.size());
    }
}


/*
Certainly! Here are the common functions/methods used in a queue implementation along with their code and explanations:

1. `add(element)` / `offer(element)`: Adds an element to the rear/tail of the queue.

```java
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
```

The `add()` method adds the specified element to the queue if it is possible to do so immediately without violating capacity restrictions. It throws an exception if the element cannot be added.

Alternatively, the `offer()` method adds the element to the queue and returns `true` if the element was successfully added. It returns `false` if the element cannot be added due to capacity restrictions.

2. `remove()` / `poll()`: Removes and returns the element at the front/head of the queue.

```java
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
int element = queue.remove();
```

The `remove()` method removes and returns the element at the front of the queue. It throws an exception if the queue is empty.

Alternatively, the `poll()` method removes and returns the element at the front of the queue, or returns `null` if the queue is empty.

3. `element()` / `peek()`: Returns the element at the front/head of the queue without removing it.

```java
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
int element = queue.element();
```

The `element()` method returns the element at the front of the queue without removing it. It throws an exception if the queue is empty.

Alternatively, the `peek()` method returns the element at the front of the queue, or returns `null` if the queue is empty.

4. `isEmpty()`: Checks if the queue is empty.

```java
Queue<Integer> queue = new LinkedList<>();
boolean isEmpty = queue.isEmpty();
```

The `isEmpty()` method returns `true` if the queue is empty, or `false` if it contains elements.

5. `size()`: Returns the number of elements in the queue.

```java
Queue<Integer> queue = new LinkedList<>();
int size = queue.size();
```

The `size()` method returns the number of elements in the queue.

These are the basic functions commonly used in a queue implementation. They allow you to add elements, remove elements, retrieve the front element, check if the queue is empty, and get the size of the queue.


 */