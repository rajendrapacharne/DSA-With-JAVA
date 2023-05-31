public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 90, 88, 11, 13};
        int n = arr.length;

        System.out.println("Array Before Sort");
        PrintArr(arr, n);

        Mergesort(arr, 0, n - 1);
        System.out.println();
        System.out.println("Array After Sort");
        PrintArr(arr, n);
    }

    private static void Mergesort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;

            // Recursively divide the array into two halves
            Mergesort(arr, i, mid);
            Mergesort(arr, mid + 1, j);

            // Merge the sorted halves
            MergeProcedure(arr, i, mid, j);
        }
    }

    private static void MergeProcedure(int[] arr, int l, int mid, int r) {
        int i, j, k = l;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temporary arrays to store the left and right subarrays
        int[] lsubarray = new int[n1];
        int[] rsubarray = new int[n2];

        // Copy data from the original array to the temporary left subarray
        for (i = 0; i < n1; i++) {
            lsubarray[i] = arr[l + i];
        }

        // Copy data from the original array to the temporary right subarray
        for (j = 0; j < n2; j++) {
            rsubarray[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;

        // Merge the two subarrays by comparing the elements
        // and placing them in the correct order in the original array
        while (i < n1 && j < n2) {
            if (lsubarray[i] <= rsubarray[j]) {
                arr[k] = lsubarray[i];
                i++;
            } else {
                arr[k] = rsubarray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray to the original array
        while (i < n1) {
            arr[k] = lsubarray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray to the original array
        while (j < n2) {
            arr[k] = rsubarray[j];
            j++;
            k++;
        }
    }

    private static void PrintArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Explanation of the code:

The main method is the entry point of the program. It initializes an array arr and the length of the array n. It then prints the array before sorting using the PrintArr method.
The Mergesort method is the recursive function that performs the merge sort algorithm. It takes the array arr, starting index i, and ending index j as parameters.
In the Mergesort method, if the starting index i is less than the ending index j, it





 */