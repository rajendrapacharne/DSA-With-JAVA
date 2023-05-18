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
