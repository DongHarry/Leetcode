package leetcode1_10.reverseInteger;

public class Solution {
    public static int reverse(int x) {

        long reversed = 0; // Sử dụng kiểu dữ liệu long để xử lý trường hợp tràn số nguyên.

        while (x != 0) {
            int digit = x % 10; // Lấy chữ số cuối cùng của số nguyên.
            reversed = reversed * 10 + digit; // Đảo ngược số bằng cách nhân 10 và cộng chữ số.
            x /= 10; // Loại bỏ chữ số cuối cùng của số nguyên.
        }

        // Kiểm tra trường hợp tràn số nguyên.
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
