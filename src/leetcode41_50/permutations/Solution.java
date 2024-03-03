package leetcode41_50.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, list, nums);
        return result;
    }


    private static void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) { // nếu list đã chứa phần tử nums[i] thì bỏ qua
                    continue;
                }
                list.add(nums[i]);
                backtrack(result, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        for (List<Integer> list : result) {
            System.out.print(list + " ");
        }
    }
}
