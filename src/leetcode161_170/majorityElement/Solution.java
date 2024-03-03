package leetcode161_170.majorityElement;

import java.net.ServerSocket;

public class Solution {
    public static int marjorityElement(int[] nums) {
        int res = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
                count++;
            } else if (res == num) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 3, 3, 2, 2, 2};
        System.out.println(marjorityElement(nums));
    }
}
