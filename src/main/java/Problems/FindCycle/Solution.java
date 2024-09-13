package Problems.FindCycle;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;

        System.out.println(hasCycle(node1));
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }
}
