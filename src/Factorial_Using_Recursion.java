import java.util.Scanner;

public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=factorial_num(n);
        System.out.println("factorial of "+n+":"+fact);
    }

    private static int factorial_num(int n) {
        int result=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            result=n*factorial_num(n-1);
        }
        return result;
    }
}

/*
This code demonstrates how to calculate the factorial of a given number using recursion.

Let's break down the code step by step:

1. The code starts by importing the `Scanner` class to read input from the user.

2. In the `main` method, an instance of `Scanner` is created to read the input from the user. The user is prompted to enter a number.

3. The entered number is stored in the variable `n`.

4. The `factorial_num` method is called with the input number `n` as an argument. The return value from this method call is stored in the variable `fact`.

5. The factorial value is printed using `System.out.println`, displaying the original number and its factorial.

6. Inside the `factorial_num` method, an `int` variable `result` is initialized to 1. This variable will store the factorial value.

7. The first `if` statement checks if the input number `n` is 0 or 1. If so, it returns 1, as the factorial of 0 and 1 is defined as 1.

8. If the input number is neither 0 nor 1, the `else` block is executed. It calculates the factorial by recursively calling the `factorial_num` method with `n-1` as the argument and multiplies it by `n`.

9. The result of the recursive call is stored in the `result` variable.

10. Finally, the `result` is returned as the factorial of the input number.

In summary, the code uses a recursive approach to calculate the factorial of a given number. The `factorial_num` method recursively calls itself until the base case is reached (when `n` is 0 or 1), and then returns the factorial value.

The main method reads an input number, calls the `factorial_num` method, and prints the factorial value.
 */