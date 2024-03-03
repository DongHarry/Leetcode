package leetcode41_50.multiplyString;

public class Solution {
    public static String mutiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // trừ '0' để chuyển từ char sang int
                int sum = mul + pos[i + j + 1]; // cộng với pos[i + j + 1] để cộng số hàng đơn vị

                pos[i + j] += sum / 10; // cộng số hàng chục
                pos[i + j + 1] = sum % 10; // cộng số hàng đơn vị
            }
        }

        StringBuilder result = new StringBuilder();
        for (int num : pos) {
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.length() == 0 ? "0" : result.toString();

    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(mutiply(num1, num2));
    }
}
