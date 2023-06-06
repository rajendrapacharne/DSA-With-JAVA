import java.util.Arrays;

public class count_number_of_inversion {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int count1 = inversion(arr, arr.length);
        System.out.println("By normal method "+count1);
        int count = inversiocount(arr, 0, arr.length - 1);
        System.out.println("This is using divide and conqure method "+count);
    }

    private static int inversion(int[] arr, int length) {
        int ct = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    ct++;
                }
            }
        }
        return ct;
    }

    private static int inversiocount(int[] arr, int l, int h) {
        int ct = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;

            ct += inversiocount(arr, l, mid); // Count inversions in the left subarray
            ct += inversiocount(arr, mid + 1, h); // Count inversions in the right subarray
            ct += mergeproceduure(arr, l, mid, h); // Count inversions across the subarrays

            return ct;
        }
        return 0;
    }

    private static int mergeproceduure(int[] arr, int l, int mid, int h) {
        int[] lsubarr = Arrays.copyOfRange(arr, l, mid + 1); // Left subarray
        int[] rsubarr = Arrays.copyOfRange(arr, mid + 1, h + 1); // Right subarray

        int i = 0, j = 0, k = l, swap = 0;
        while (i < lsubarr.length && j < rsubarr.length) {
            if (lsubarr[i] <= rsubarr[j]) {
                arr[k] = lsubarr[i]; // Copy the smaller element from the left subarray
                i++;
            } else {
                arr[k] = rsubarr[j]; // Copy the smaller element from the right subarray
                j++;
                swap += lsubarr.length - i; // Update the inversion count
            }
            k++;
        }

        // Copy remaining elements from the left subarray
        while (i < lsubarr.length) {
            arr[k++] = lsubarr[i++];
        }
        // Copy remaining elements from the right subarray
        while (j < rsubarr.length) {
            arr[k++] = rsubarr[j++];
        }

        return swap;
    }
}
