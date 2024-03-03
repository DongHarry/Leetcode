package leetcode21_30.divideTwoInt;

public class Solution {
    public static int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1; // ^ is XOR
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }
        return sign == 1 ? result : -result;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = -3;
        int result = divide(dividend, divisor);
        System.out.println(result);
    }
}
