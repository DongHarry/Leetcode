package leetcode1_10.longestPalindrome;

public class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Trường hợp chuỗi con có độ dài lẻ
            int len2 = expandAroundCenter(s, i, i+1); // Trường hợp chuỗi con có độ dài chẵn
            int len = Math.max(len1, len2); // Lấy độ dài lớn nhất giữa len1 và len2
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }

    // Hàm này trả về độ dài của chuỗi con đối xứng từ vị trí left và right
    public static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
