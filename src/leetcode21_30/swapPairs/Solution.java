package leetcode21_30.swapPairs;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = head.next.next;
        second.next = first;
        first.next = swapPairs(third);  // gọi đệ quy để thực hiện việc đảo các cặp tiếp theo
        return second;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
