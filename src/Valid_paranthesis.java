import java.util.Scanner;
import java.util.Stack;

public class Valid_paranthesis {

    public static boolean isvalidpara(String para) {
        char[] arr = para.toCharArray();
        Stack<Character> stack1 = new Stack<>();

        for (char ele : arr) {
            if (ele == '(' || ele == '{' || ele == '[') {
                // If an opening parenthesis is encountered, push it onto the stack
                stack1.push(ele);
                continue;
            } else if (stack1.isEmpty()) {
                // If a closing parenthesis is encountered but the stack is empty, it means
                // there is no corresponding opening parenthesis, so the parentheses are not valid
                return false;
            }
            char top = stack1.pop(); // Pop the top element from the stack

            if (top == '(' && ele != ')') {
                // If the top element is '(' and the current element is not ')', the parentheses are not valid
                return false;
            } else if (top == '[' && ele != ']') {
                // If the top element is '[' and the current element is not ']', the parentheses are not valid
                return false;
            } else if (top == '{' && ele != '}') {
                // If the top element is '{' and the current element is not '}', the parentheses are not valid
                return false;
            }
        }
        // After iterating through all the elements, if the stack is empty, it means all parentheses were properly closed
        return (stack1.isEmpty() == true);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter parentheses");
        String para = s.nextLine();
        if (isvalidpara(para)) {
            System.out.println("Correct parentheses");
        } else {
            System.out.println("Incorrect parentheses");
        }
    }
}
