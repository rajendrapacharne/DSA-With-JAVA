package Interview_Questions;
import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int target = s.nextInt();
        HashMap <Integer,Integer> dataa=new HashMap<>();
        for (int i = 0; i < n; i++) {
            dataa.put(arr[i],i);
        }
        int result[]=new int[2];

        for(int i=0;i<n;i++)
        {

            if(arr[i]==target && dataa.containsKey(0))
            {

                result[0]=i;
                result[1]=dataa.get(0);
                break;

            }
            else if(dataa.containsKey(target-arr[i])){

                if(dataa.get(target -arr[i])>i)
                {
                    result[0]=i;
                    result[1]=dataa.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two sum index values are "+result[0] +" "+result[1]);

    }
}

/*
This program is written in Java and is called "Two_Sum". It aims to find the indices of two numbers in an array that add up to a given target value.

Let's go through the program step by step:

1. Importing Required Packages:
   - The program starts by importing the necessary packages. In this case, it imports `java.util.HashMap` and `java.util.Scanner`. The `Scanner` class is used to read user input, while the `HashMap` class is used to store key-value pairs.

2. Defining the Main Method:
   - The program defines the `main` method, which serves as the entry point of the program.

3. Reading User Input:
   - The program creates a `Scanner` object `s` to read input from the user.
   - It reads an integer `n` from the user, which represents the size of the array.
   - It initializes an integer array `arr` of size `n` to store the elements.
   - It then reads `n` integers from the user and stores them in the `arr` array.

4. Printing the Array:
   - The program prints the elements of the array `arr` by iterating over it using a `for` loop. This is done to display the input values for verification purposes.

5. Reading the Target Value:
   - The program reads an integer `target` from the user. This is the target value that the two numbers in the array should add up to.

6. Creating a HashMap:
   - The program creates a `HashMap<Integer, Integer>` called `dataa` to store the array elements as keys and their indices as values.
   - It iterates over the array `arr` using a `for` loop and puts each element as a key and its index as a value in the `dataa` map.

7. Finding the Two Numbers:
   - The program initializes an integer array `result` of size 2 to store the indices of the two numbers that add up to the target value.
   - It then iterates over the array `arr` using a `for` loop.
   - Inside the loop, it checks two conditions:
     - If the current element `arr[i]` is equal to the target value and the `dataa` map contains the value 0 as a key, it means there is a duplicate element in the array that can be used to achieve the target sum. In this case, it assigns the indices `i` and `dataa.get(0)` to `result[0]` and `result[1]`, respectively, and breaks out of the loop.
     - If the difference between the target value and the current element (`target - arr[i]`) exists as a key in the `dataa` map, it means there is a pair of elements that add up to the target value. It also checks if the index corresponding to the difference is greater than the current index `i`. If both conditions are satisfied, it assigns the indices `i` and `dataa.get(target - arr[i])` to `result[0]` and `result[1]`, respectively, and breaks out of the loop.

8. Printing the Result:
   - Finally, the program prints the indices of the two numbers that add up to the target value by accessing `result[0]` and `result[1]`.

In summary, this program reads an array of integers, a target value, and uses a HashMap to find the indices of two numbers in the array that add up to the target value.
 */


