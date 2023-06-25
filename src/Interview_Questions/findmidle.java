package Interview_Questions;

import java.util.Arrays;

public class findmidle {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11,17};
        int arr2[]={2,4,6,8,10,13};
        int al=arr1.length+arr2.length;
        int arr3[]=new int[al];



        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        if(al%2==0) {
            System.out.println(arr3[al / 2]);
        }
        else {
            int ml=(al/2)-1;
            int mh=(al/2)+1;
            int mid=(ml+mh)/2;
            System.out.println(mid);
        }

    }
}
