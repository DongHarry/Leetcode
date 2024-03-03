package leetcode1_10.zigzagConversion;

public class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        int step = 1;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            if (index == 0) {
                step = 1;
            }
            if (index == numRows - 1) {
                step = -1;
            }
            index += step;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : sb) {
            result.append(stringBuilder);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
