package uz.mirzokhidkh.linkedList.easy;

public class P206_Reverse_Linked_List {

    //ITERATIVE SOLUTION
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



    //RECURSIVE SOLUTION
    public ListNode reverseList2(ListNode head) {
        if(head == null) return null;
        ListNode reverse = new ListNode(head.val);
        return recursive(head.next, reverse);
    }


    public ListNode recursive(ListNode head,ListNode reverse){
        if(head == null){
            return reverse;
        }
        ListNode node = new ListNode(head.val);
        node.next = reverse;
        return recursive(head.next,node);
    }
}
