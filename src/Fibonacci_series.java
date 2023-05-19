import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fib=Fibonacci(n);
        System.out.println("Fibonacci of "+n+":"+fib);
    }

    private static int Fibonacci(int n) {

        if(n==0 || n==1)
        {
            return n;
        }
        else {
           return Fibonacci(n-1)+Fibonacci(n-2);
        }

    }
}


/*
This Java program calculates the Fibonacci series up to a given input number. Here's a step-by-step explanation of the code:

1. The program starts by importing the necessary package, `java.util.Scanner`, to handle user input.

2. The class `Fibonacci_series` is defined.

3. The `main` method is the entry point of the program. It creates a `Scanner` object, `s`, to read user input.

4. The user is prompted to enter a number, which is stored in the variable `n` using `s.nextInt()`.

5. The program calls the `Fibonacci` method and passes the input number `n` to it. The returned Fibonacci value is stored in the variable `fib`.

6. Finally, the program prints the Fibonacci value with the corresponding input number using `System.out.println()`.

7. The `Fibonacci` method is a recursive function that calculates the Fibonacci number for a given input `n`. It takes an integer `n` as a parameter.

8. Inside the `Fibonacci` method, there's a base condition check: if `n` is either 0 or 1, it returns the same value because the Fibonacci of 0 is 0 and the Fibonacci of 1 is 1.

9. If the base condition is not met, the method recursively calls itself with `n-1` and `n-2` as parameters and adds the results together to calculate the Fibonacci number for `n`.

10. The recursive calls continue until the base condition is reached, and then the calculated Fibonacci number is returned.

In summary, this program uses recursion to calculate the Fibonacci series up to a given input number and displays the corresponding Fibonacci value.

 */