import java.util.Scanner;

public class Tiles_Problem {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int noo=GetWays(n);
    System.out.println(noo);

    }

    private static int GetWays(int n) {
        if(n<=3)
        {
            return n;
        }

            return GetWays(n-1) + GetWays(n-2);

    }

}


/*
The Tiles Problem is a mathematical problem that involves arranging tiles on a floor of size 'n' in a certain pattern. Each tile is of size 1x1, and the floor can be filled using tiles of sizes 1x1, 1x2, or 2x1.

The question asks for the number of ways to arrange the tiles on the floor of size 'n' using the given tile sizes. The task is to write a program that calculates and prints the number of possible arrangements.

The solution to the Tiles Problem is implemented in the code provided. Here's an explanation of the code:

1. The main method:
   - It creates a Scanner object to read the input from the user.
   - It prompts the user to enter the number of tiles (floor size) and stores it in the variable 'n'.
   - It calls the 'getWays' method, passing the floor size as an argument, and stores the result in the variable 'ways'.
   - It prints the number of ways to arrange the tiles using the 'System.out.println' statement.

2. The getWays method:
   - It takes an integer 'n' as input, representing the floor size.
   - It checks if the floor size is less than or equal to 3. If so, it returns 'n' as the base case since there are only 'n' possible arrangements.
   - If the floor size is greater than 3, it recursively calculates the number of ways to arrange the tiles by subtracting 1 or 2 from the floor size and summing up the results.
   - The recursive calls continue until the base case is reached, and the final result is returned.

The code recursively solves the Tiles Problem by breaking down the problem into smaller subproblems. It efficiently calculates the number of ways to arrange tiles on the floor of size 'n' by utilizing the recursive nature of the problem.
 */