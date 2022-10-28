package uz.mirzokhidkh.linkedList.medium;

import uz.mirzokhidkh.Util.ListNode;

public class P328_Odd_Even_Linked_List {


    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode even = new ListNode(-1);

        ListNode curr = head, curEven = even, prev = null;

        while (curr != null && curr.next != null) {

            curEven.next = new ListNode(curr.next.val);
            curEven = curEven.next;

            curr.next = curr.next.next;

            prev = curr;

            curr = curr.next;
        }

        if (curr == null) {
            prev.next = even.next;
        } else {
            curr.next = even.next;
        }

        return head;
    }

}
