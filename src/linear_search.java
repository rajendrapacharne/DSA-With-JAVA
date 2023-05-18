import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int la=arr.length;
        int ct=0;
        for(int i=0;i<la;i++)
        {
            if(arr[i]==k)
            {
                ct++;
                break;
            }
        }
        if(ct>0)
        {
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}
