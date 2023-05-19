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

/*
Linear Search, also known as Sequential Search, is a simple search algorithm that checks each element in a list or array one by one until the target value is found or until the end of the list is reached. It is straightforward and easy to understand, but it can be relatively inefficient for large datasets.

Here's a step-by-step explanation of how Linear Search works:

1. Start at the beginning of the list or array.
2. Compare the target value with the current element.
   - If the current element matches the target value, the search is successful, and the index of the target is returned.
   - If the current element does not match the target value, move to the next element in the list.
3. Repeat step 2 until either the target value is found or the end of the list is reached.

If the target value is not found after examining all elements, the search is unsuccessful, and a special value (such as -1) can be returned to indicate that the target is not present in the list.

Linear Search has a time complexity of O(n), where n is the number of elements in the list. In the worst-case scenario, where the target value is at the end of the list or not present at all, the algorithm needs to examine every element in the list. This makes linear search inefficient for large lists compared to other search algorithms like Binary Search or Hashing.

However, Linear Search has its advantages. It is simple to implement, works on unsorted lists, and does not require any pre-processing or special conditions. It can be useful when the list is small or when the elements are not sorted. Additionally, Linear Search can be extended to handle additional conditions, such as searching for multiple occurrences of a target value.

Overall, while Linear Search may not be the most efficient option for large datasets, it remains a basic and fundamental search algorithm to consider in various scenarios.
 */