import java.util.Scanner;

public class findingpowerusingrecurssiion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pow=s.nextInt();

        System.out.println("power of "+n+" ^ "+pow);

        int result = powerof(n,pow);
        System.out.println("power is "+result);

    }

    private static int powerof(int n, int pow) {

        int result=1;
        if(pow==1)
        {
            return n;
        }
        else {
            result=n*powerof(n,pow-1);
        }
        return result;
    }
}


/*
Certainly! Let's go through an example to understand how the code calculates the power of a number using recursion.

Suppose we want to calculate the power of 3 raised to the power of 4 (3^4).

When you run the code, it prompts you to enter two integers:
```
Enter the base number: 3
Enter the power: 4
```

You input `3` as the base number and `4` as the power.

The code then executes the following steps:

1. It calls the `powerof` method with the base number `3` and the power `4`.

2. Inside the `powerof` method, it checks if the power (`pow`) is equal to `1`. In this case, it's not.

3. Since the power is not `1`, it calculates the power recursively by multiplying the base number (`n`) with the result of calling `powerof` again with the same base number (`n`) and a decreased power (`pow-1`).

4. The recursion continues until the power (`pow`) becomes `1`.

5. At the last recursive call when the power is `1`, the method returns the base number (`n`).

6. The result is then calculated as the product of the base number (`n`) and the value returned by the recursive call.

7. Finally, the result is printed as the power of the base number. In this case, it will output:
```
power of 3 ^ 4
power is 81
```

So, in this example, the code correctly calculates that 3 raised to the power of 4 is equal to 81 using recursion.
 */