package uz.mirzokhidkh.linkedList.medium;

public class P61_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) return head;

        int n = getLengthOf(head);

        k = k % n;

        if (k == 0) return head;

        int i = 0;

        ListNode temp = head;

        while (temp.next != null) {
            if (i + 1 == n - k) {
                ListNode newHead = temp.next;
                temp.next = null;
                temp = newHead;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = head;
                return newHead;
            }
            i++;
            temp = temp.next;
        }

        return head;
    }

    public int getLengthOf(ListNode head) {
        int n = 1;

        ListNode temp = head;
        while (temp.next != null && temp.next.next != null) {
            n += 2;
            temp = temp.next.next;
        }
        if (temp.next != null) {
            ++n;
        }
        return n;
    }
}
