package leetcode1_10.longestSubstring;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[256]; // bảng mã ascii có 256 ký tự
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i); // cập nhật i nếu ký tự đã xuất hiện trước đó
            ans = Math.max(ans, j - i + 1); // cập nhật độ dài chuỗi con không chứa ký tự trùng lặp
            index[s.charAt(j)] = j + 1; // cập nhật vị trí xuất hiện của ký tự
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
