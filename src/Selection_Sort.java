import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,10,12,1,5,6};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionsort(int[] arr) {

        for(int i=0;i< arr.length;i++)
        {
            int min_ind=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[min_ind])
                {
                    min_ind=j;
                }
            }
            if(min_ind !=i)
            {
                int temp=arr[min_ind];
                arr[min_ind]=arr[i];
                arr[i]=temp;
            }
        }

    }
}

/*
Selection Sort is a simple sorting algorithm that repeatedly selects the smallest (or largest) element from the unsorted portion of the list and places it at the beginning of the sorted portion. It is an in-place algorithm, meaning it sorts the list by swapping elements within the original array.

Here's a step-by-step explanation of how Selection Sort works:

1. Start with the first element (index 0) and consider it as the minimum (or maximum) value.
2. Compare the minimum (or maximum) value with the remaining elements in the list.
3. If a smaller (or larger) value is found, update the minimum (or maximum) value to the new element.
4. Continue comparing the minimum (or maximum) value with the remaining unsorted elements until the end of the list is reached.
5. Once the end of the list is reached, swap the minimum (or maximum) value with the element at the current starting position (index 0 for the first pass, index 1 for the second pass, and so on).
6. Move the starting position one index forward and repeat steps 2-5 until the entire list is sorted.

Here's a visualization of the Selection Sort process:

Initial List: 7, 4, 2, 9, 1

Pass 1: 1, 4, 2, 9, 7
Pass 2: 1, 2, 4, 9, 7
Pass 3: 1, 2, 4, 9, 7
Pass 4: 1, 2, 4, 7, 9

In each pass, the smallest element in the unsorted portion is found and swapped with the element at the current starting position, gradually building the sorted portion of the list.

Selection Sort has a time complexity of O(n^2) in the worst and average case, where n is the number of elements in the list. It performs a series of comparisons and swaps, resulting in nested loops. As a result, it is not the most efficient sorting algorithm for large datasets.

Despite its relatively slow performance, Selection Sort has its merits. It is simple to implement, requires minimal additional memory, and performs well on small lists or lists where swapping elements is inexpensive compared to the cost of comparisons.

However, for larger datasets, other sorting algorithms like QuickSort, Merge Sort, or Heap Sort are generally preferred due to their more efficient time complexities.
 */