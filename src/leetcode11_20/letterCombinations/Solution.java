package leetcode11_20.letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i)); // lấy giá trị số từ ký tự char
            while (result.get(0).length() == i) {
                String t = result.remove(0); // xóa và trả về phần tử đầu tiên của result
                for (char s : mapping[x].toCharArray()) { // duyệt qua các ký tự trong mapping[x]
                    result.add(t + s); // thêm chuỗi t + s vào result
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
