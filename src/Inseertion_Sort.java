import java.util.Arrays;
import java.util.Scanner;

public class Inseertion_Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }

       // int arr[]={4,3,2,10,12,1,5,6};
        System.out.println("Before Insertion Sort");
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("After Insertion Sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr) {

        for(int i=1;i< arr.length;i++)
        {
            int j=i;
            while (j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}


/*
Insertion Sort is a simple sorting algorithm that works by repeatedly inserting elements from an unsorted portion of the list into their correct position in the sorted portion. It is an in-place algorithm, meaning it does not require additional memory space to perform the sorting.

Here's a step-by-step explanation of how Insertion Sort works:

1. Start with the second element (index 1) and consider it as the key.
2. Compare the key with the element(s) on its left side (elements with smaller indices) and move them one position to the right until you find the correct position to insert the key.
3. Insert the key into the correct position in the sorted portion of the list.
4. Move to the next unsorted element (the element immediately to the right of the previously sorted portion) and repeat steps 2-3.
5. Repeat steps 2-4 until all elements are sorted.

Here's a visualization of the Insertion Sort process:

Initial List: 7, 4, 2, 9, 1

Pass 1: 4, 7, 2, 9, 1
Pass 2: 2, 4, 7, 9, 1
Pass 3: 2, 4, 7, 9, 1
Pass 4: 1, 2, 4, 7, 9

In each pass, the sorted portion of the list grows by one element, and the unsorted portion becomes smaller. The key element is compared and shifted to the left until it finds its correct position in the sorted portion.

Insertion Sort has a time complexity of O(n^2) in the worst and average case, where n is the number of elements in the list. It performs well on small lists or when the input is already partially sorted. In fact, it has a best-case time complexity of O(n) when the list is already sorted, as no or minimal shifting is required.

Although Insertion Sort is not as efficient as some other sorting algorithms (such as QuickSort or Merge Sort) for larger lists, it has some advantages. It is easy to understand, implement, and is particularly useful for sorting small datasets or when the list is already partially sorted. It also has a relatively low overhead in terms of additional memory usage.
 */