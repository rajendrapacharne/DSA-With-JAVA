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
