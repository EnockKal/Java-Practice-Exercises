package com.enock;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
//        String s = "([{}])";
//        String s = "()[]{}";
        String s = "][";
        System.out.println(validParentheses(s));
    }

    private static boolean validParentheses(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));

            if (s.charAt(i) == ')') {
                if (stack.empty()) return false;
                if (stack.peek() != '(') return false;
                stack.pop();
            }
            if (s.charAt(i) == ']') {
                if (stack.empty()) return false;
                if (stack.peek() != '[') return false;
                stack.pop();
            }
            if (s.charAt(i) == '}') {
                if (stack.empty()) return false;
                if (stack.peek() != '{') return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
