package leetcode71_80.combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(result, combination, 1, n, k);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> combination, int start, int n, int k) {
        if (k == 0) {
            result.add((new ArrayList<Integer>(combination)));
            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            backtrack(result, combination, i + 1, n, k - 1);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combine(n, k);
        for (List<Integer> list : result) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
