package leetcode31_40.longestValidParenthese;

import java.util.Stack;

public class Solution {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // khởi tạo stack với giá trị giả -1
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // tính chiều dài ngoặc đúng
                    max = Math.max(max, i - stack.peek()); // i - stack.peek() là độ dài của chuỗi con hợp lệ hiện tại
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(longestValidParentheses(s));
    }
}
