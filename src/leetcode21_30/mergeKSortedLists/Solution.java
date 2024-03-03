package leetcode21_30.mergeKSortedLists;

import java.util.PriorityQueue;

public class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for (ListNode list : lists) { // thêm các danh sách vào queue
            if (list != null) {
                queue.add(list);
            }
        }

        ListNode tmp = new ListNode();
        ListNode current = tmp;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll(); // lấy node nhỏ nhất từ queue
            current.next = node; // thêm node nhỏ nhất vào danh sách kết quả
            current = current.next; // cập nhật current
            if (node.next != null) { // nếu node có phần tử tiếp theo
                queue.add(node.next); // thêm phần tử tiếp theo vào queue
            }
        }

        return tmp.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = new ListNode[] {l1, l2, l3};
        ListNode result = mergeKLists(lists);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
