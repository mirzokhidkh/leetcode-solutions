package uz.mirzokhidkh.linkedList.easy;

public class P203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode res = new ListNode(-1);
        res.next = head;

        ListNode cur = res;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return res.next;
    }
}
