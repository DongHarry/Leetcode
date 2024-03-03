package leetcode41_50.firstMissingPositive;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // đánh dấu số num - 1 đã xuất hiện bằng cách đổi dấu của số num - 1 thành số âm
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]); // đánh dấu số num - 1 đã xuất hiện
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        System.out.println(firstMissingPositive(nums));
    }
}
