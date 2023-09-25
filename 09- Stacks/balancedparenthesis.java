//all the brackets should be closed and brackets open latest should be closed first

import java.util.Stack;

public class balancedparenthesis {

    static boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[')
                stack.push(current);
            else {
                if (stack.isEmpty())
                    return false;
                else if (!matching(stack.peek(), current))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty(); //extra opening brackets
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
