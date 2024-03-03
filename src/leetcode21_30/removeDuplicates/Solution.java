package leetcode21_30.removeDuplicates;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) // j là vị trí hiện tại của mảng đang xét đến
            if (nums[j] != nums[i]) nums[++i] = nums[j]; // i là vị trí cuối cùng của mảng không trùng nhau
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
        }
    }
}
