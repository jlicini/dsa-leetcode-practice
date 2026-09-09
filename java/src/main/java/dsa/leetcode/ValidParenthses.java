package dsa.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthses {

    public static void main(String[] args) {
        ValidParenthses validParenthses = new ValidParenthses();
        System.out.println(validParenthses.isValid("[({})]"));
    }

    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpening = stack.pop();

                if (current == ')' && lastOpening != '(') {
                    return false;
                }

                if (current == ']' && lastOpening != '[') {
                    return false;
                }

                if (current == '}' && lastOpening != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
