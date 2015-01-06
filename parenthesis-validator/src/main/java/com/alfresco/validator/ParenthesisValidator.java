package com.alfresco.validator;

import java.util.Stack;

/**
 * Created by trupti on 06/01/15.
 */
public class ParenthesisValidator {
    private String inputString;

    public ParenthesisValidator(String input) {
        this.inputString = input;
    }

    public boolean validate() {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            char current = inputString.charAt(i);

            // push opening brackets
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            // peek and pop closing brackets if matched
            if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastInStack = stack.peek();
                if ((current == ')' && lastInStack == '(') || (current == ']' && lastInStack == '[' ) || ( current == '}' && lastInStack == '{')) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
