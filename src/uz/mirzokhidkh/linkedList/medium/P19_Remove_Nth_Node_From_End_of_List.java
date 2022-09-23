package uz.mirzokhidkh.linkedList.medium;

public class P19_Remove_Nth_Node_From_End_of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head, fast = head, prev = null;

        int i = 0, j = 0;

        while (slow != null) {

            if (fast != null && fast.next != null) {
                if (fast.next.next != null) {
                    i += 2;
                } else {
                    ++i;
                }
                fast = fast.next.next;
            }

            if (fast == null || fast.next == null) {

                if (j == i + 1 - n) {
                    if (prev != null) {
                        prev.next = slow.next;
                    } else {
                        return slow.next;
                    }

                    break;

                }

                prev = slow;
                slow = slow.next;
                j++;
            }
        }

        return head;
    }
}
