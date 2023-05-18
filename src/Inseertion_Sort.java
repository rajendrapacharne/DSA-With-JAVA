import java.util.Arrays;

public class Inseertion_Sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,10,12,1,5,6};
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
