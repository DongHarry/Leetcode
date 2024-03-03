package leetcode61_70.rotateList;

public class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        while (k > 0) {
            ListNode tail = head;
            ListNode newTail = head;
            while (tail.next != null) {
                newTail = tail;
                tail = tail.next;
            }
            tail.next = head;
            head = tail;
            newTail.next = null;
            k--;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = rotateRight(head, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
