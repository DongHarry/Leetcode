package leetcode181_190.rotateArray;

public class Solution {
    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
