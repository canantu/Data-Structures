package Problems.MergeTwoSortedLinkedList;

public class Solution {

    public ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {

        ListNode tempHead = new ListNode();
        ListNode prev = tempHead;
        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                prev.next = curr1;
                curr1 = curr1.next;
            }else {
                prev.next = curr2;
                curr2 = curr2.next;
            }
            prev = prev.next;
        }
        // check for leftovers
        if (curr1 == null) {
            prev.next = curr2;
        }else {
            prev.next = curr1;
        }
        return tempHead.next;
    }
}
