package uz.mirzokhidkh.linkedList.medium;

import uz.mirzokhidkh.Util.ListNode;

public class P24_Swap_Nodes_in_Pairs {


    //Recursive approach
    public ListNode swapPairs(ListNode head) {
        swap(head);
        return head;
    }

    public void swap(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int temp = head.next.val;
        head.next.val = head.val;
        head.val = temp;

        swap(head.next.next);
    }
}
