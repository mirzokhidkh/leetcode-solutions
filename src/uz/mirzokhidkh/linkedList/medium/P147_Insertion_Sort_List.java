package uz.mirzokhidkh.linkedList.medium;

import uz.mirzokhidkh.Util.ListNode;

public class P147_Insertion_Sort_List {

    public ListNode insertionSortList(ListNode head) {

        ListNode cur = head;
        ListNode sorted = new ListNode(0);
        ListNode pre                   = sorted;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;

            if(pre.val >= cur.val){
                pre = sorted;
            }

            while (pre.next != null  && pre.next.val < cur.val) {
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            cur = next;

        }

        return sorted.next;
    }
}
