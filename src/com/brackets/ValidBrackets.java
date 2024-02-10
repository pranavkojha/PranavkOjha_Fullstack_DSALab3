package com.brackets;

import java.util.HashMap;
import java.util.Stack;

public class ValidBrackets {
    String brackets;
    Stack<Character> stack;

    /** Default constructor for brackets
     *
     * @param brackets in string which needs validation.
     */
    public ValidBrackets(String brackets) {
        this.stack = new Stack<Character>();
        this.brackets = brackets;
    }

    /**
     * This method validates if the given brackets are valid or not.
     *
     * @return True if brackets are valid, returns false otherwise.
     */
    boolean validate() {
        // Map to store the opening brackets for each of closing brackets.
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (Character ch: this.brackets.toCharArray()) {
            switch (ch) {
                // For all opening braces, push them in stack.
                case '(':
                case '[':
                case '{':
                    this.stack.push(ch);
                    break;
                // For all closing brackets we do more processing.
                case ')':
                case ']':
                case '}':
                    if(this.stack.empty()){
                        return false;
                    }

                    // If top of stack is not matching a relevant opening bracket,
                    // the brackets are not valid.
                    Character top = this.stack.pop();
                    Character b = map.get(ch);
                    if(!b.equals(top))
                        return false;
                    break;
                default:
                    return false;
                }
            }
        return this.stack.empty();
    }
}
