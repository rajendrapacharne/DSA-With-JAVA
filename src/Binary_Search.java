import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[]={1,2,3,4,5,6,7,8,9};

        int result=BinarySearch(arr,k);


        if(result!=0)
        {
            System.out.println("Element Found "+result);
        }
        else {
            System.out.println("Element Not Found "+result);
        }
    }

    private static int BinarySearch(int[] arr, int k) {

        int low =0;
        int high= arr.length-1;

        while (low<=high)
        {
            int mid=(low+(high-low)/2);
            if(arr[mid]==k)
            {
                return mid;
            }
            else if (arr[mid]<k) {
                low=mid+1;
            }
            else {
                high=high-1;
            }
        }

        return 0;
    }
}

/*
Binary Search is an efficient search algorithm used to find a specific target value within a sorted array or list. It follows a divide-and-conquer approach by repeatedly dividing the search space in half until the target value is found or determined to be absent.

Here's a step-by-step explanation of how Binary Search works:

1. Start with a sorted array or list of elements.
2. Set the lower bound (left pointer) to the first index of the array and the upper bound (right pointer) to the last index.
3. Calculate the middle index by taking the average of the lower and upper bounds (rounding down if necessary).
4. Compare the middle element with the target value:
   - If the middle element is equal to the target value, the search is successful, and the index of the target is returned.
   - If the middle element is greater than the target value, the target must be in the lower half of the remaining elements. Adjust the upper bound to be the middle index minus one and go to step 3.
   - If the middle element is less than the target value, the target must be in the upper half of the remaining elements. Adjust the lower bound to be the middle index plus one and go to step 3.
5. Repeat steps 3-4 until the target value is found or the lower bound becomes greater than the upper bound.
6. If the lower bound becomes greater than the upper bound, the target value is not present in the array.

Binary Search has a time complexity of O(log n), where n is the number of elements in the sorted array. This logarithmic time complexity makes it very efficient, especially for large datasets, as it eliminates half of the search space in each iteration.

Binary Search is a widely used algorithm and forms the basis for many other search and optimization algorithms. It is often preferred over linear search (which has a time complexity of O(n)) when working with sorted data.
 */