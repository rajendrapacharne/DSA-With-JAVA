public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 90, 88, 11, 13};
        int n = arr.length;

        System.out.println("Array Before Sort");
        PrintArr(arr, n);

        Quicksort(arr, 0, n - 1);

        System.out.println();
        System.out.println("Array After Sort");
        PrintArr(arr, n);
    }

    // This method partitions the array by selecting a pivot element and rearranging the array
    // such that all elements less than or equal to the pivot are on the left side,
    // and all elements greater than the pivot are on the right side.
    private static int partition(int[] arr, int l, int h) {
        int i = l;
        int pivot = arr[l];

        for (int j = i + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swapping arr[l] and arr[i]
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }

    // This method implements the quicksort algorithm recursively.
    private static void Quicksort(int[] arr, int l, int h) {
        if (l < h) {
            // Selecting a pivot element and partitioning the array
            int m = partition(arr, l, h);
            // Recursively sorting the left and right subarrays
            Quicksort(arr, l, m - 1);
            Quicksort(arr, m + 1, h);
        }
    }

    // This method prints the elements of the array.
    private static void PrintArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
