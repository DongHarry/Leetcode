package leetcode31_40.longestValidParenthese;

import java.util.Stack;

public class Solution {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        return s.length() - stack.size();
    }

    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(longestValidParentheses(s));
    }
}
