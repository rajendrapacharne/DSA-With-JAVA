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

/*
This code demonstrates how to rotate a given 2D array (matrix) by 90 degrees in a clockwise direction.

Let's break down the code step by step:

1. The initial 2D array `arr` is defined with some values representing the matrix.

2. The outer `for` loop is used to iterate over each row of the matrix, and the inner `for` loop is used to iterate over each column. The values of the matrix are printed using `System.out.print` to display the original matrix.

3. The `rotatearray` function is called to rotate the matrix.

4. Inside the `rotatearray` function, the dimensions of the matrix (number of rows and columns) are determined.

5. The first nested loop swaps the elements across the main diagonal of the matrix. This operation essentially transposes the matrix.

6. The second nested loop swaps the elements of each row, starting from both ends and moving towards the center. This step flips the matrix horizontally.

7. After the rotation is complete, the rotated matrix is printed using `Arrays.toString`.

In summary, the code rotates the given matrix by first transposing it (swapping elements across the main diagonal) and then flipping it horizontally. This process effectively rotates the matrix by 90 degrees in a clockwise direction.
 */