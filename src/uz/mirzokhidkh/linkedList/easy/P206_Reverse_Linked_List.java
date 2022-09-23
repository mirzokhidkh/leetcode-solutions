package uz.mirzokhidkh.linkedList.easy;

public class P206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode  reversed = new ListNode(head.val);
        ListNode cur = head, newHead;

        while (cur.next != null) {

            newHead = new ListNode(cur.next.val);
            newHead.next = reversed;
            reversed = newHead;

            cur = cur.next;

        }

        return reversed;
    }
}
