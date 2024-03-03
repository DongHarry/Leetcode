package leetcode51_60.insertInterval;

public class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        int i = 0, j = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            res[j++] = intervals[i++];
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res[j++] = newInterval;
        while (i < intervals.length) {
            res[j++] = intervals[i++];
        }
        int[][] result = new int[j][2];
        for (int k = 0; k < j; k++) {
            result[k] = res[k];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = insert(intervals, newInterval);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}
