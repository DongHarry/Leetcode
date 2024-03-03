package leetcode111_120.pascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            res.add(1);
            for (int j = i - 1; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
