public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nArray after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Bubble Sort is a simple and commonly used sorting algorithm. It gets its name from the way smaller elements "bubble" to the top of the list as the algorithm iterates through it. Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order until the entire list is sorted.

Here's a step-by-step explanation of how Bubble Sort works:

1. Start at the beginning of the list/array.
2. Compare the first element with the second element. If the first element is greater than the second element, swap them.
3. Move to the next pair of elements (the second and third elements) and compare them. Again, swap them if they are in the wrong order.
4. Repeat this process for every pair of adjacent elements in the list, moving from left to right.
5. Each pass through the list will "bubble" the largest unsorted element to its correct position at the end of the list.
6. Repeat steps 2-5 until the entire list is sorted.

Bubble Sort has a time complexity of O(n^2) in the worst and average case, where n is the number of elements in the list. This makes it inefficient for large lists. However, it has a best-case time complexity of O(n) when the list is already sorted, as it only requires one pass to confirm that the list is sorted.

Despite its simplicity, Bubble Sort is not commonly used in practice for large datasets due to its relatively slow performance compared to more efficient sorting algorithms like QuickSort or Merge Sort. Nonetheless, it serves as a good introductory algorithm to understand the basic concepts of sorting and can be useful for small datasets or educational purposes.
 */