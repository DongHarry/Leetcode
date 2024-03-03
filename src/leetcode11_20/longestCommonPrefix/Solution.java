package leetcode11_20.longestCommonPrefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        System.out.println(prefix);
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // nếu không tìm thấy prefix trong strs[i]
                prefix = prefix.substring(0, prefix.length() - 1); // xóa ký tự cuối cùng
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
