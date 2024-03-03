package leetcode61_70.sqrt;

public class Solution {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int temp = 1;
        while (temp <= x / temp) {
            temp++;
        }
        return temp - 1;
    }

    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
