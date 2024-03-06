package leetcode21_30.findTheIndex;

public class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)  return 0;
        if (haystack.length() < needle.length())  return -1;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
