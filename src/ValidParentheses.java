//Name: 20. Valid Parentheses
//Difficulty: Easy
//Description: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    //determine if the input string is valid.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data structure: stacks

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        int count = 0;
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                charStack.push(curr);
                count++;
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char next = charStack.peek();
                if ((curr == ')' &&  next == '(') ||
                        (curr == ']' &&  next == '[') ||
                        (curr == '}' &&  next == '{')) {
                    charStack.pop();
                } else {
                    return false;
                }
                count--;
            }
        }
        return (count == 0);
    }
}