package Code13;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(validateBrackets("{}")); // TRUE
        System.out.println(validateBrackets("{}(){}")); // TRUE
        System.out.println(validateBrackets("()[[Extra Characters]]")); // TRUE
        System.out.println(validateBrackets("(){}[[]]")); // TRUE
        System.out.println(validateBrackets("{}{Code}[Fellows](())")); // TRUE
        System.out.println(validateBrackets("[({}]")); // FALSE
        System.out.println(validateBrackets("(]")); // FALSE
        System.out.println(validateBrackets("{(})")); // FALSE
    }

    public static boolean validateBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false; // closing bracket arrived without corresponding opening.
                }
                char last = stack.peek();
                if(current == ')' && last == '(' || current == ']' && last == '[' || current == '}' && last == '{') {
                    stack.pop();
                } else {
                    return false; // mismatched bracket types.
                }
            }
        }
        return stack.isEmpty(); // any unmatched opening brackets remaining?
    }
}

