package leetcode1_10.palindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder reverse = new StringBuilder();
        reverse.append(x);
        reverse.reverse();

        if (reverse.toString().equals(String.valueOf(x))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
