package uz.mirzokhidkh.linkedList.medium;

public class P147_Insertion_Sort_List {

//      Definition for singly-linked list.
      public class ListNode {
         int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


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
