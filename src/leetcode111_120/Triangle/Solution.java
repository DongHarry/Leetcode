package leetcode111_120.Triangle;

import java.util.List;

public class Solution {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;

        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) < min) {
                    min = row.get(j);
                }
            }
            sum += min;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new java.util.ArrayList<>();
        triangle.add(new java.util.ArrayList<>(java.util.Arrays.asList(2)));
        triangle.add(new java.util.ArrayList<>(java.util.Arrays.asList(3, 4)));
        triangle.add(new java.util.ArrayList<>(java.util.Arrays.asList(6, 5, 7)));
        triangle.add(new java.util.ArrayList<>(java.util.Arrays.asList(4, 1, 8, 3)));
        System.out.println(minimumTotal(triangle));
    }

}
