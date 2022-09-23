package uz.mirzokhidkh.linkedList.medium;


import java.util.Objects;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P142_Linked_List_Cycle_II {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(0);
        ListNode next3 = new ListNode(-4);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next2;

        assert intersect(head) != null;
        System.out.println(detectCycle(head).val);
    }

    public static ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode intersect = intersect(head);

        if(intersect == null){
            return null;
        }

        ListNode start = head;


        while(start != intersect){

            start = start.next;
            intersect = intersect.next;

            System.out.println(start.val + " <-> " + intersect.val);

        }

        return start;
    }


    public static ListNode intersect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return slow;
            }
        }

        return null;
    }


}
