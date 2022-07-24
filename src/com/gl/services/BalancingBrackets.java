package com.gl.services;
import java.util.Stack;
public class BalancingBrackets {
    public static boolean bracketCheck(String bracketExpression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : bracketExpression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char popch = stack.pop();
            switch (ch) {
                case ')':
                    if (popch == '}' || popch == ']') {
                        return false;
                    }
                    break;
                case '}':
                    if (popch == ')' || popch == ']') {
                        return false;
                    }
                    break;
                case ']':
                    if (popch == ')' || popch == '}') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return (stack.isEmpty());
    }
}
