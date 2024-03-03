package leetcode111_120.pascalTriangle;

import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return null;
        List<List<Integer>> res = new java.util.ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new java.util.ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
