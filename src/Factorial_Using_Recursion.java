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
