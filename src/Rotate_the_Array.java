// Rotate array by 90 degree
import java.util.Arrays;

public class Rotate_the_Array {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // for printing an array
        int row= arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        // fuction to swapt and rotate array
            rotatearray(arr);
            for(var mat:arr)
            {
                System.out.println(Arrays.toString(mat));
            }

    }

    private static void rotatearray(int[][] arr) {
        int row= arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }

        // swap the left and right col

        for(int i=0;i<row;i++)
        {
            int li=0;
            int  ri=col-1;

            while (li<ri)
            {
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }

        }


    }
}
